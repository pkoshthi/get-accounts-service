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
	
	//defining accounttype as column name
	@Column
	private String accounttype;
	
	//defining isActive as column name
	@Column
	private boolean isActive;
	
	//defining balance as column name
	@Column
	private double balance;
	
	//defining customerId as column name
	@Column
	private int customerId;
	
	public Account(int accountNumber, String accounttype, boolean isActive, double balance, int customerId) {
		super();
		this.accountNumber = accountNumber;
		this.accounttype = accounttype;
		this.isActive = isActive;
		this.balance = balance;
		this.customerId = customerId;
	}
	
	//defining getter and setter methods

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
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
