package com.accounts.service;

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
		return accountRepository.findAllProjectedNativeQuery(customerId);
	}
}
