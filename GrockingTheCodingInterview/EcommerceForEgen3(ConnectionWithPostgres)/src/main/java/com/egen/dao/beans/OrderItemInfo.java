package com.egen.dao.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.egen.dao.ecommerceinterface.OrderInfoDao;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "order_item_info")
public class OrderItemInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_item_info_id")
	private Long orderItemInfoId;

	private Integer orderItemQuantity;

	private Double orderItemSubtotal;

	@Enumerated(EnumType.STRING)
	private OrderItemSubstatus orderItemSubstatus;

	private Date orderItemDateCreated;

	private Date orderItemDateModified;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderInfo orderInfo;

	@OneToOne
	@JoinColumn(name = "item_id", referencedColumnName = "item_id")
	private Item orderItem;

	public Long getOrderItemInfoId() {
		return orderItemInfoId;
	}

	public void setOrderItemInfoId(Long orderItemInfoId) {
		this.orderItemInfoId = orderItemInfoId;
	}

	public Integer getOrderItemQuantity() {
		return orderItemQuantity;
	}

	public void setOrderItemQuantity(Integer orderItemQuantity) {
		this.orderItemQuantity = orderItemQuantity;
	}

	public Double getOrderItemSubtotal() {
		return orderItemSubtotal;
	}

	public void setOrderItemSubtotal(Double orderItemSubtotal) {
		this.orderItemSubtotal = orderItemSubtotal;
	}

	public OrderItemSubstatus getOrderItemSubstatus() {
		return orderItemSubstatus;
	}

	public void setOrderItemSubstatus(OrderItemSubstatus orderItemSubstatus) {
		this.orderItemSubstatus = orderItemSubstatus;
	}

	public Date getOrderItemDateCreated() {
		return orderItemDateCreated;
	}

	public void setOrderItemDateCreated(Date orderItemDateCreated) {
		this.orderItemDateCreated = orderItemDateCreated;
	}

	public Date getOrderItemDateModified() {
		return orderItemDateModified;
	}

	public void setOrderItemDateModified(Date orderItemDateModified) {
		this.orderItemDateModified = orderItemDateModified;
	}

	public OrderInfo getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public Item getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(Item orderItem) {
		this.orderItem = orderItem;
	}

}
