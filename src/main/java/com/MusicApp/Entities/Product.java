package com.MusicApp.Entities;

public class Product {
	private long pId;
	private String pName;
	private String pDesc;
	private int pPrice;
	private String pImg;

	// default constructor
	public Product() {

	}
	
	public Product(long pId) {
		
	}

	// parameter constructor
	public Product(long pId, String pName, String pDesc, int pPrice, String pImg) {
		this.pId = pId;
		this.pName = pName;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
		this.pImg = pImg;
	}

	public Product(String pName, String pDesc, int pPrice, String pImg) {
		this.pName = pName;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
		this.pImg = pImg;
	}

	// getter and setter
	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public String getpImg() {
		return pImg;
	}

	public void setpImg(String pImg) {
		this.pImg = pImg;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pDesc=" + pDesc + ", pPrice=" + pPrice + ", pImg=" + pImg
				+ "]";
	}

}
