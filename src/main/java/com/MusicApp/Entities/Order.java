package com.MusicApp.Entities;

import java.util.Date;

public class Order {
	private long oId;
	private String productName;
	private int pPrice;
	private String customerName;
	private String date;

	// default constructor
	public Order() {

	}

	// constructor with different parameter
	public Order(long oId, String productName, int pPrice, String customerName, String date) {

		this.oId = oId;
		this.productName = productName;
		this.pPrice = pPrice;
		this.customerName = customerName;
		this.date = date;
	}

	// constructor with different parameter
	public Order(String productName, int pPrice, String customerName, String date) {
		this.productName = productName;
		this.pPrice = pPrice;
		this.customerName = customerName;
		this.date = date;
	}

	// getter and setter method

	public long getoId() {
		return oId;
	}

	public void setoId(long oId) {
		this.oId = oId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Order [oId=" + oId + ", productName=" + productName + ", pPrice=" + pPrice + ", customerName="
				+ customerName + ", date=" + date + "]";
	}

}
