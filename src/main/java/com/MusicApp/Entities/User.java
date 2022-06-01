package com.MusicApp.Entities;

public class User {
	private long userId;
	private String username;
	private String userpassword;

	// default constructor
	public User() {
		
	}
	
	// parameter constructor
	public User(long userId, String username, String userpassword) {
		this.userId = userId;
		this.username = username;
		this.userpassword = userpassword;
	}

	public User(String username, String userpassword) {
		this.username = username;
		this.userpassword = userpassword;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userpassword=" + userpassword + "]";
	}

}
