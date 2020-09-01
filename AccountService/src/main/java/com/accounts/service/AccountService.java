package com.accounts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.model.Account;
import com.accounts.repository.AccountRepository;

//defining the business logic
@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	
	//getting all account details of a customer
	public List<Account> getAllAccount(int customerId)
	{
		List<Account> accounts=new ArrayList<Account>();
		accountRepository.findAll().forEach(account -> {if(account.getCustomerId() == customerId)
														   accounts.add(account);
													    });
		return accounts;
	}
}
