package com.egen.bussiness;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.egen.bussiness.response.OrderInputRequest;
import com.egen.bussiness.response.OrderOutputResponse;
import com.egen.bussiness.response.ResponseOrderItem;
import com.egen.bussiness.response.ShippingInfo;
import com.egen.dao.beans.OrderInfo;
import com.egen.dao.beans.OrderItemInfo;
import com.egen.dao.beans.OrderItemSubstatus;
import com.egen.dao.beans.OrderPaymentInfo;
import com.egen.dao.beans.OrderPaymentStatus;
import com.egen.dao.beans.OrderStatus;
import com.egen.dao.beans.OrderTransactionStatus;
import com.egen.service.EcommerceService;
import jdk.jshell.Snippet.SubKind;

@Component
public class EcommerceBussiness {

	@Autowired
	EcommerceService service;

	public void saveSingleOrder(OrderInputRequest orderInputRequest) {

		OrderInfo orderInfo = createOrderInfoToSave(orderInputRequest.getOrderInfo());
		List<OrderItemInfo> orderItemInfoList = createOrderItemInfoListToSave(orderInfo,
				orderInputRequest.getOrderItems());

		OrderPaymentInfo orderPaymentInfo = createOrderPaymentInfo(orderInfo, orderInputRequest.getPaymentInfo());

		service.saveSingleOrder(orderInfo, orderItemInfoList, orderPaymentInfo);
	}

	private OrderPaymentInfo createOrderPaymentInfo(OrderInfo orderInfo, OrderPaymentInfo paymentInfo) {

		paymentInfo.setOrderInfo(orderInfo);
		paymentInfo.setPaymentConfirmationNumber((long) new Random().nextInt(Integer.MAX_VALUE));
		paymentInfo.setPaymentDate(new Date());

		return paymentInfo;
	}

	private List<OrderItemInfo> createOrderItemInfoListToSave(OrderInfo orderInfo, List<OrderItemInfo> orderItems) {

		for (OrderItemInfo orderItemInfo : orderItems) {
			orderItemInfo.setOrderInfo(orderInfo);
			orderItemInfo.setOrderItem(orderItemInfo.getOrderItem());
			orderItemInfo.setOrderItemQuantity(orderItemInfo.getOrderItemQuantity());
			Double itemPrice = service.getItemPrice(orderItemInfo.getOrderItem().getItemId());
			orderItemInfo.setOrderItemSubtotal(itemPrice * orderItemInfo.getOrderItemQuantity());
			orderItemInfo.setOrderItemSubstatus(OrderItemSubstatus.RECIEVED);
			orderItemInfo.setOrderItemDateCreated(new Date());
			orderItemInfo.setOrderItemDateModified(new Date());
		}

		return orderItems;
	}

	private OrderInfo createOrderInfoToSave(OrderInfo orderInfo) {

		orderInfo.setOrderStatus(OrderStatus.RECIEVED);
		orderInfo.setOrderPaymentStatus(OrderPaymentStatus.PENDING);
		orderInfo.setOrderCreatedDate(new Date());
		orderInfo.setOrderModifiedDate(new Date());
		orderInfo.setOrderShippingAddressLine1(orderInfo.getOrderShippingAddressLine1());
		orderInfo.setOrderShippingAddressLine2(orderInfo.getOrderShippingAddressLine2());
		orderInfo.setOrderShippingCity(orderInfo.getOrderShippingCity());
		orderInfo.setOrderShippingState(orderInfo.getOrderShippingState());
		orderInfo.setOrderShippingZip(orderInfo.getOrderShippingZip());

		return orderInfo;
	}

	public OrderOutputResponse getOrderById(Long id) {

		OrderOutputResponse orderOutputResponse = new OrderOutputResponse();

		OrderInfo orderInfo = service.getOrderInfoById(id);
		List<OrderItemInfo> orderItemInfoList = service.getAllOrderItemInfo(id);

		generateOutputResponse(orderInfo, orderItemInfoList, orderOutputResponse);

		return orderOutputResponse;
	}

	private void generateOutputResponse(OrderInfo orderInfo, List<OrderItemInfo> orderItemInfoList,
			OrderOutputResponse orderOutputResponse) {

		if (orderInfo != null && orderItemInfoList != null) {

			orderOutputResponse.setCustomerId(orderInfo.getOrderCustomerId());
			orderOutputResponse.setOrderId(orderInfo.getOrderId());

			orderOutputResponse.setOrderPaymentStatus(orderInfo.getOrderPaymentStatus());
			orderOutputResponse.setOrderShippingCharges(orderInfo.getOrderShippingCharges());
			orderOutputResponse.setOrderShippingMethod(orderInfo.getOrderShippingMethod());
			orderOutputResponse.setOrderStatus(orderInfo.getOrderStatus());
			orderOutputResponse.setOrderTax(orderInfo.getOrderTax());

			orderOutputResponse.setShippingInfo(new ShippingInfo(orderInfo.getOrderShippingAddressLine1(),
					orderInfo.getOrderShippingAddressLine2(), orderInfo.getOrderShippingCity(),
					orderInfo.getOrderShippingState(), orderInfo.getOrderShippingZip()));

			List<ResponseOrderItem> orderItemList = new ArrayList<>();

			for (OrderItemInfo orderItem : orderItemInfoList) {
				ResponseOrderItem responseOrderItem = new ResponseOrderItem();
				responseOrderItem.setItemName(orderItem.getOrderItem().getItemName());
				responseOrderItem.setItemPrice(orderItem.getOrderItem().getItemPrice());
				responseOrderItem.setItemQuantity(orderItem.getOrderItemQuantity());
				responseOrderItem.setItemSubstatus(orderItem.getOrderItemSubstatus());
				orderItemList.add(responseOrderItem);
			}

			orderOutputResponse.setOrderItems(new ArrayList<>(orderItemList));

		}

	}

	public void saveOrderInBulk(List<OrderInputRequest> orderInputRequestList) {

		List<OrderInfo> bulkOrderInfo = new ArrayList<>();
		List<OrderItemInfo> bulkOrderItemInfo = new ArrayList<>();
		List<OrderPaymentInfo> bulkOrdePaymentInfo = new ArrayList<>();

		for (OrderInputRequest orderInputRequest : orderInputRequestList) {
			OrderInfo orderInfo = createOrderInfoToSave(orderInputRequest.getOrderInfo());

			List<OrderItemInfo> orderItemInfoList = createOrderItemInfoListToSave(orderInfo,
					orderInputRequest.getOrderItems());

			OrderPaymentInfo paymentInfo = createOrderPaymentInfo(orderInfo, orderInputRequest.getPaymentInfo());
			bulkOrderInfo.add(orderInfo);
			bulkOrderItemInfo.addAll(orderItemInfoList);

			bulkOrdePaymentInfo.add(paymentInfo);

		}
		service.saveBulkOrder(bulkOrderInfo, bulkOrderItemInfo, bulkOrdePaymentInfo);

	}

	public void cancelOrder(Long orderId) {

		OrderInfo orderInfo = service.getOrderInfoById(orderId);
		if (orderInfo != null) {
			orderInfo.setOrderStatus(OrderStatus.CANCELED);
			List<OrderItemInfo> orderItemInfos = service.getAllOrderItemInfo(orderId);
			for (OrderItemInfo orderItemInfo : orderItemInfos) {
				orderItemInfo.setOrderItemSubstatus(OrderItemSubstatus.CANCELED);
			}

			List<OrderPaymentInfo> orderPaymentInfos = service.getAllOrderPaymentInfo(orderId);

			for (OrderPaymentInfo orderPaymentInfo : orderPaymentInfos) {
				orderPaymentInfo.setOrderTransactionStatus(OrderTransactionStatus.REFUNDED);
			}
			service.cancelOrder(orderInfo, orderPaymentInfos);
		}

	}

	public void updateOrderInBulk(Map<Long, OrderStatus> statusMap) {

		for (Entry<Long, OrderStatus> e : statusMap.entrySet()) {
			service.updateOrderById(e.getKey(), e.getValue());
		}

	}

}
