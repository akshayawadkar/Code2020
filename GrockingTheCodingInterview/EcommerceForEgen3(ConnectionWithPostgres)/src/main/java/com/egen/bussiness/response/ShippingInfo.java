package com.egen.bussiness.response;

public class ShippingInfo {
	private String shippingAdressLine1;
	private String shippingAdressLine2;
	private String city;
	private String state;
	private String zip;

	public ShippingInfo() {

	}

	public ShippingInfo(String shippingAdressLine1, String shippingAdressLine2, String city, String state, String zip) {
		super();
		this.shippingAdressLine1 = shippingAdressLine1;
		this.shippingAdressLine2 = shippingAdressLine2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getShippingAdressLine1() {
		return shippingAdressLine1;
	}

	public void setShippingAdressLine1(String shippingAdressLine1) {
		this.shippingAdressLine1 = shippingAdressLine1;
	}

	public String getShippingAdressLine2() {
		return shippingAdressLine2;
	}

	public void setShippingAdressLine2(String shippingAdressLine2) {
		this.shippingAdressLine2 = shippingAdressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
