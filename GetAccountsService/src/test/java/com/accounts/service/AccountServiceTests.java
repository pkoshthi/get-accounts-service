package com.accounts.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.accounts.model.Account;
import com.accounts.repository.AccountRepository;

@SpringBootTest
public class AccountServiceTests {

	@Mock
	private AccountRepository accountRepository;
	
	@InjectMocks // auto inject accountRepository
	AccountService accountService = new AccountService();
	
	@BeforeEach
    void setMockOutput()
	{   
		when(accountRepository.findAllProjectedNativeQuery(201)).thenReturn(getAccountList());
	}
	
	@DisplayName("Test Mock accountService + accountRepository")
    @Test
    void testGetAllAccount() {
		
        assertEquals(getAccountList().size(), accountService.getAllAccount(201).size());
    }
	
	private List<Account> getAccountList()
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
