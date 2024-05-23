package com.infy.infymemobile.model;

import java.time.LocalDate;

public class Transaction {
	
	private int transactionId;
	private String modeOfTransaction;
	private long receiverAccountNumber;
	private long senderAccountNumber;
	private LocalDate  transactionDate;
	private double transactionAmount;
	
	public Transaction(int transactionId, String modeOfTransaction, long receiverAccountNumber,
			long senderAccountNumber, LocalDate transactionDate, double transactionAmount) {
		super();
		this.transactionId = transactionId;
		this.modeOfTransaction = modeOfTransaction;
		this.receiverAccountNumber = receiverAccountNumber;
		this.senderAccountNumber = senderAccountNumber;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
	}
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getModeOfTransaction() {
		return modeOfTransaction;
	}
	public void setModeOfTransaction(String modeOfTransaction) {
		this.modeOfTransaction = modeOfTransaction;
	}
	public long getReceiverAccountNumber() {
		return receiverAccountNumber;
	}
	public void setReceiverAccountNumber(long receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
	}
	public long getSenderAccountNumber() {
		return senderAccountNumber;
	}
	public void setSenderAccountNumber(long senderAccountNumber) {
		this.senderAccountNumber = senderAccountNumber;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", modeOfTransaction=" + modeOfTransaction
				+ ", receiverAccountNumber=" + receiverAccountNumber + ", senderAccountNumber=" + senderAccountNumber
				+ ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount + "]";
	}
	
	
	

}
