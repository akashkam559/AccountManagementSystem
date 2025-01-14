package com.barclays.AccountManagementSystem.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class AccountTransaction {
	@Id
	private long transactionId;

	private String referenceNumber;

	private Date dateTime;

	private long transactionType;

	private long subType;

	private double balance;
    
	private String accountNumber;
	
	

	public AccountTransaction(long transactionId, String referenceNumber, Date dateTime, long transactionType,
			long subType, double balance, String accountNumber) {
		super();
		this.transactionId = transactionId;
		this.referenceNumber = referenceNumber;
		this.dateTime = dateTime;
		this.transactionType = transactionType;
		this.subType = subType;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public long getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(long transactionType) {
		this.transactionType = transactionType;
	}

	public long getSubType() {
		return subType;
	}

	public void setSubType(long subType) {
		this.subType = subType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
}
