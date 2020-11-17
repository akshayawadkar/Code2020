package com.egen.dao.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "order_payment_info")
public class OrderPaymentInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentId;

	private Long paymentConfirmationNumber;

	private Double paymentAmount;

 

	private Date paymentDate;

	@Enumerated(EnumType.STRING)
	private OrderTransactionStatus orderTransactionStatus;
	
	@Enumerated(EnumType.STRING)
	private PaymentMethod paymentMethod;

	private String orderBillingAddressLine1;

	private String orderBillingAddressLine2;

	private String orderBillingCity;

	private String orderBillingState;

	private String orderBillingZip;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderInfo orderInfo;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getPaymentConfirmationNumber() {
		return paymentConfirmationNumber;
	}

	public void setPaymentConfirmationNumber(Long paymentConfirmationNumber) {
		this.paymentConfirmationNumber = paymentConfirmationNumber;
	}

	public Double getAmount() {
		return paymentAmount;
	}

	public void setAmount(Double amount) {
		this.paymentAmount = amount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getOrderBillingAddressLine1() {
		return orderBillingAddressLine1;
	}

	public void setOrderBillingAddressLine1(String orderBillingAddressLine1) {
		this.orderBillingAddressLine1 = orderBillingAddressLine1;
	}

	public String getOrderBillingAddressLine2() {
		return orderBillingAddressLine2;
	}

	public void setOrderBillingAddressLine2(String orderBillingAddressLine2) {
		this.orderBillingAddressLine2 = orderBillingAddressLine2;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getOrderBillingCity() {
		return orderBillingCity;
	}

	public void setOrderBillingCity(String orderBillingCity) {
		this.orderBillingCity = orderBillingCity;
	}

	public String getOrderBillingState() {
		return orderBillingState;
	}

	public void setOrderBillingState(String orderBillingState) {
		this.orderBillingState = orderBillingState;
	}

	public String getOrderBillingZip() {
		return orderBillingZip;
	}

	public void setOrderBillingZip(String orderBillingZip) {
		this.orderBillingZip = orderBillingZip;
	}

	public OrderInfo getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public OrderTransactionStatus getOrderTransactionStatus() {
		return orderTransactionStatus;
	}

	public void setOrderTransactionStatus(OrderTransactionStatus orderTransactionStatus) {
		this.orderTransactionStatus = orderTransactionStatus;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
 

}
