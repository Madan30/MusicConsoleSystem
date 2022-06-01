package com.MusicApp.Entities;

public class Category {
	private long catId;
	private String catName;
	private String catDesc;

	// default constructor
	public Category() {

	}

	// parameter constructor
	public Category(long catId, String catName, String catDesc) {

		this.catId = catId;
		this.catName = catName;
		this.catDesc = catDesc;
	}

	// parameter constructor
	public Category(String catName, String catDesc) {

		this.catName = catName;
		this.catDesc = catDesc;
	}

	public long getCatId() {
		return catId;
	}

	public void setCatId(long catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + ", catDesc=" + catDesc + "]";
	}

}
