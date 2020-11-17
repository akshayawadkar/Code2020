package com.egen.bussiness.response;

import com.egen.dao.beans.OrderItemSubstatus;

public class ResponseOrderItem {

	private String itemName;
	private Double itemPrice;
	private Integer itemQuantity;
	private Double itemSubtotal;
	private OrderItemSubstatus itemSubstatus;

	public ResponseOrderItem() {

	}

	public ResponseOrderItem(String itemName, Double itemPrice, Integer itemQuantity, Double itemSubtotal,
			OrderItemSubstatus itemSubstatus) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
		this.itemSubtotal = itemSubtotal;
		this.itemSubstatus = itemSubstatus;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Double getItemSubtotal() {
		return itemSubtotal;
	}

	public void setItemSubtotal(Double itemSubtotal) {
		this.itemSubtotal = itemSubtotal;
	}

	public OrderItemSubstatus getItemSubstatus() {
		return itemSubstatus;
	}

	public void setItemSubstatus(OrderItemSubstatus itemSubstatus) {
		this.itemSubstatus = itemSubstatus;
	}

}
