package com.MusicApp.Entities;

public class Customer {
	private long cId;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNum;
	private String userName;
	private String password;
	
	// default constructor
	public Customer() {
		
	}
	
	//parameter constructor
	public Customer(long cId, String firstName, String lastName, String address, String phoneNum, String userName, String password) {
		this.cId = cId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNum = phoneNum;
		this.userName = userName;
		this.password = password;
	}
	
	//parameter constructor
	public Customer(String firstName, String lastName, String address, String phoneNum, String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNum = phoneNum;
		this.userName = userName;
		this.password = password;
	}
	
	// getter and setter method
	public long getcId() {
		return cId;
	}

	public void setcId(long cId) {
		this.cId = cId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", phoneNum=" + phoneNum + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	

}
