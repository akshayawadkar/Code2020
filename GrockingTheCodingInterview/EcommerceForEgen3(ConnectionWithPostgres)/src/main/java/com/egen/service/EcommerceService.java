package com.egen.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.egen.dao.beans.OrderInfo;
import com.egen.dao.beans.OrderItemInfo;
import com.egen.dao.beans.OrderPaymentInfo;
import com.egen.dao.beans.OrderStatus;
import com.egen.dao.ecommerceinterface.OrderInfoDao;
import com.egen.dao.impl.ItemDaoImpl;
import com.egen.dao.impl.OrderInfoDaoImpl;
import com.egen.dao.impl.OrderItemInfoDaoImpl;
import com.egen.dao.impl.PaymentInfoDaoImpl;

@Service
public class EcommerceService {

	@Autowired
	private OrderInfoDaoImpl orderInfoDaoImpl;

	@Autowired
	private OrderItemInfoDaoImpl orderItemInfoDaoImpl;

	@Autowired
	private ItemDaoImpl itemDaoImpl;

	@Autowired
	private PaymentInfoDaoImpl paymentInfoDaoImpl;

	public OrderInfo getOrderInfoById(Long id) {
		return orderInfoDaoImpl.getById(id);

	}

	public List<OrderItemInfo> getAllOrderItemInfo(Long id) {

		return orderItemInfoDaoImpl.getAllOrderItemInfo(id);
	}

	public void saveSingleOrder(OrderInfo orderInfo, List<OrderItemInfo> orderItemInfoList,
			OrderPaymentInfo orderPaymentInfo) {

		orderInfoDaoImpl.save(orderInfo);
		orderItemInfoDaoImpl.saveAll(orderItemInfoList);
		paymentInfoDaoImpl.save(orderPaymentInfo);

	}

	public void saveBulkOrder(List<OrderInfo> bulkOrderInfo, List<OrderItemInfo> bulkOrderItemInfo,
			List<OrderPaymentInfo> bulkOrdePaymentInfo) {
		orderInfoDaoImpl.saveAll(bulkOrderInfo);
		orderItemInfoDaoImpl.saveAll(bulkOrderItemInfo);
		paymentInfoDaoImpl.saveAll(bulkOrdePaymentInfo);
	}

	public Double getItemPrice(Long itemId) {

		return itemDaoImpl.findById(itemId).getItemPrice();
	}

	public List<OrderPaymentInfo> getAllOrderPaymentInfo(Long orderId) {

		return paymentInfoDaoImpl.getAllOrderPaymentInfo(orderId);
	}

	public void cancelOrder(OrderInfo orderInfo, List<OrderPaymentInfo> orderPaymentInfos) {
		orderInfoDaoImpl.save(orderInfo);
		paymentInfoDaoImpl.saveAll(orderPaymentInfos);
	}

	public void updateOrderById(Long orderId, OrderStatus orderStatus) {
		OrderInfo orderInfo = this.getOrderInfoById(orderId);
		orderInfo.setOrderStatus(orderStatus);
		orderInfoDaoImpl.save(orderInfo);
		
	}

}
