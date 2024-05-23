package com.infy.infymemobile.model;

public class Login {
	
	private long mobileNumber;
	private String  password;
	
	
	
	public Login(long mobileNumber, String password) {
		super();
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
