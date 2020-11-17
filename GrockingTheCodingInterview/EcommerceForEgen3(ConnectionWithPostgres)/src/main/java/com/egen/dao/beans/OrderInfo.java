package com.egen.dao.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "order_info")
public class OrderInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Long orderId;

	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;

	private Integer orderCustomerId;

	private Float orderTax;

	private Float orderShippingCharges;

	private Double orderTotal;

	@Enumerated(EnumType.STRING)
	private OrderShippingMethod orderShippingMethod;

	@Enumerated(EnumType.STRING)
	private OrderPaymentStatus orderPaymentStatus;

	private Date orderCreatedDate;

	private Date orderModifiedDate;

	private String orderShippingAddressLine1;

	private String orderShippingAddressLine2;

	private String orderShippingCity;

	private String orderShippingState;

	private String orderShippingZip;

	@OneToMany(mappedBy = "orderInfo", cascade = CascadeType.ALL)
	private List<OrderItemInfo> orderItemInfoList = new ArrayList<>();

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getOrderCustomerId() {
		return orderCustomerId;
	}

	public void setOrderCustomerId(Integer orderCustomerId) {
		this.orderCustomerId = orderCustomerId;
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

	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
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

	public Date getOrderCreatedDate() {
		return orderCreatedDate;
	}

	public void setOrderCreatedDate(Date orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}

	public Date getOrderModifiedDate() {
		return orderModifiedDate;
	}

	public void setOrderModifiedDate(Date orderModifiedDate) {
		this.orderModifiedDate = orderModifiedDate;
	}

	public String getOrderShippingAddressLine1() {
		return orderShippingAddressLine1;
	}

	public void setOrderShippingAddressLine1(String orderShippingAddressLine1) {
		this.orderShippingAddressLine1 = orderShippingAddressLine1;
	}

	public String getOrderShippingAddressLine2() {
		return orderShippingAddressLine2;
	}

	public void setOrderShippingAddressLine2(String orderShippingAddressLine2) {
		this.orderShippingAddressLine2 = orderShippingAddressLine2;
	}

	public String getOrderShippingCity() {
		return orderShippingCity;
	}

	public void setOrderShippingCity(String orderShippingCity) {
		this.orderShippingCity = orderShippingCity;
	}

	public String getOrderShippingState() {
		return orderShippingState;
	}

	public void setOrderShippingState(String orderShippingState) {
		this.orderShippingState = orderShippingState;
	}

	public String getOrderShippingZip() {
		return orderShippingZip;
	}

	public void setOrderShippingZip(String orderShippingZip) {
		this.orderShippingZip = orderShippingZip;
	}

	public List<OrderItemInfo> getOrderItemInfoList() {
		return orderItemInfoList;
	}

	public void setOrderItemInfoList(List<OrderItemInfo> orderItemInfoList) {
		this.orderItemInfoList = orderItemInfoList;
	}

	
	
}
