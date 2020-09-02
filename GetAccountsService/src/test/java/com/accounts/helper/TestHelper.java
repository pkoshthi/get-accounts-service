package com.accounts.helper;

import java.util.ArrayList;
import java.util.List;

import com.accounts.model.Account;

//test helper class with common methods
public class TestHelper {

	public static List<Account> getAccountList()
	{
		List<Account> accounts=new ArrayList<Account>();
		Account account=new Account();
		account.setAccountNumber(1001);
		account.setAccountType("Savings");
		account.setActive(true);
		account.setBalance(2000.00);
		account.setCustomerId(201);
	    accounts.add(account);
	    return accounts;
	}
}
