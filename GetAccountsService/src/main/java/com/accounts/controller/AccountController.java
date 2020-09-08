package com.accounts.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.model.Account;
import com.accounts.service.AccountService;
import com.accounts.exception.RecordNotFoundException;

//Creating a rest controller
@RestController
public class AccountController {

	//autowired the AccountService class
	@Autowired
	AccountService accountService;
		
	//creating a get mapping that retrieves all the accounts detail of customer from the database 
	@GetMapping("/account/{customerId}")
	private List<Account> getAllAccount(@Valid @PathVariable("customerId") int customerId) 
	{
		List<Account> accounts =  accountService.getAllAccount(customerId);
		if(accounts.isEmpty())
		{
			throw new RecordNotFoundException("Customer id '" + customerId + "' does not exist");
		}
		
		return accounts;
	}
	
}
