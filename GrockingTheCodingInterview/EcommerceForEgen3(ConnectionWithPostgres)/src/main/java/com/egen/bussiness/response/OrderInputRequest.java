package com.egen.bussiness.response;

import java.util.List;

import com.egen.dao.beans.OrderInfo;
import com.egen.dao.beans.OrderItemInfo;
import com.egen.dao.beans.OrderPaymentInfo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

 
public class OrderInputRequest {
	
	private OrderInfo orderInfo;
	private List<OrderItemInfo> orderItems;
	private OrderPaymentInfo paymentInfo;
	
	
	public OrderInfo getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}
	public List<OrderItemInfo> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItemInfo> orderItems) {
		this.orderItems = orderItems;
	}
	public OrderPaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(OrderPaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	
	
	

}
