package com.infy.infymemobile.model;

import java.time.LocalDate;

public class Account {

		// TODO Auto-generated method stub
		private Long accountNumber;
		private String bankName;
		private  Double balance;
		private String accountType;
		private LocalDate openingDate;
		private Long mobileNumber;
		
		
		
		public Account(Long accountNumber, String bankName, Double balance, String accountType, LocalDate openingDate,
				Long mobileNumber) {
			super();
			this.accountNumber = accountNumber;
			this.bankName = bankName;
			this.balance = balance;
			this.accountType = accountType;
			this.openingDate = openingDate;
			this.mobileNumber = mobileNumber;
		}
		public Long getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(Long accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public Double getBalance() {
			return balance;
		}
		public void setBalance(Double balance) {
			this.balance = balance;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public LocalDate getOpeningDate() {
			return openingDate;
		}
		public void setOpeningDate(LocalDate openingDate) {
			this.openingDate = openingDate;
		}
		public Long getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(Long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		
		
		
		
}