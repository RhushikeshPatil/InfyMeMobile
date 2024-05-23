package com.infy.infymemobile.model;

public class DigitalAccount {
	
	private String digitalBankingId;
	private long mobileNumber;
	private long accountNumber;
	private String accountType;
	public DigitalAccount(String digitalBankingId, long mobileNumber, long accountNumber, String accountType) {
		super();
		this.digitalBankingId = digitalBankingId;
		this.mobileNumber = mobileNumber;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}
	public String getDigitalBankingId() {
		return digitalBankingId;
	}
	public void setDigitalBankingId(String digitalBankingId) {
		this.digitalBankingId = digitalBankingId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	
	

}
