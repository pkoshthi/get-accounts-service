package com.accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.model.Account;
import com.accounts.service.AccountService;

//Creating a rest controller
@RestController
public class AccountController {

	//autowired the AccountService class
	@Autowired
	AccountService accountService;
	
	//creating a get mapping that retrieves all the accounts detail from the database 
	@GetMapping("/account/{customerId}")
	private List<Account> getAllAccount(@PathVariable("customerId") int customerId)
	{
		return accountService.getAllAccount(customerId);
	}
	
}
