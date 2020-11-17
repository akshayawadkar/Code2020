package com.egen.bussiness.response;

import java.util.List;

import com.egen.dao.beans.OrderItemInfo;
import com.egen.dao.beans.OrderPaymentStatus;
import com.egen.dao.beans.OrderShippingMethod;
import com.egen.dao.beans.OrderStatus;

public class OrderOutputResponse {

	private Long orderId;
	private Integer customerId;
	private OrderStatus orderStatus;
	private Float orderTax;
	private Float orderShippingCharges;
	private OrderShippingMethod orderShippingMethod;
	private OrderPaymentStatus orderPaymentStatus;
	private ShippingInfo shippingInfo;
	private List<ResponseOrderItem> orderItems;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Float getOrderTax() {
		return orderTax;
	}
	public void setOrderTax(Float orderTax) {
		this.orderTax = orderTax;
	}
	public Float getOrderShippingCharges() {
		return orderShippingCharges;
	}
	public void setOrderShippingCharges(Float orderShippingCharges) {
		this.orderShippingCharges = orderShippingCharges;
	}
	public OrderShippingMethod getOrderShippingMethod() {
		return orderShippingMethod;
	}
	public void setOrderShippingMethod(OrderShippingMethod orderShippingMethod) {
		this.orderShippingMethod = orderShippingMethod;
	}
	public OrderPaymentStatus getOrderPaymentStatus() {
		return orderPaymentStatus;
	}
	public void setOrderPaymentStatus(OrderPaymentStatus orderPaymentStatus) {
		this.orderPaymentStatus = orderPaymentStatus;
	}
	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}
	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
	public List<ResponseOrderItem> getOrderIems() {
		return orderItems;
	}
	public void setOrderItems(List<ResponseOrderItem> orderIems) {
		this.orderItems = orderIems;
	}
	

}
