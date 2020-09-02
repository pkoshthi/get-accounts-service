package com.accounts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark the class as an Entity
@Entity
//defining class name as table name
@Table
public class Account {
	
	//mark accountNumber as primary key
	@Id
	//defining accountNumber as column name
	@Column
	private int accountNumber;
	
	//defining accountType as column name
	@Column
	private String accountType;
	
	//defining isActive as column name
	@Column
	private boolean isActive;
	
	//defining balance as column name
	@Column
	private double balance;
	
	//defining customerId as column name
	@Column
	private int customerId;
		
	//defining getter and setter methods

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
}
