package com.accounts.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.accounts.helper.TestHelper;
import com.accounts.model.Account;
import com.accounts.repository.AccountRepository;

// account service tests class with test methods
@SpringBootTest
public class AccountServiceTests {

	@Mock
	private AccountRepository accountRepository;

	@InjectMocks // auto inject accountRepository
	AccountService accountService = new AccountService();

	@BeforeEach
	void setMockOutput() {
		when(accountRepository.findAllProjectedNativeQuery(201)).thenReturn(TestHelper.getAccountList());
		when(accountRepository.findAllProjectedNativeQuery(000)).thenReturn(new ArrayList<Account>());
	}

	// test case with mock data
	@DisplayName("Test Mock accountService + accountRepository")
	@Test
	void testGetAllAccount() {
		List<Account> customeraccounts = accountService.getAllAccount(201);
		Account account = customeraccounts.get(0);
		assertEquals(1,customeraccounts.size());
		assertEquals(201, account.getCustomerId());
		assertEquals("Savings",account.getAccountType());
		assertEquals(2000.00,account.getBalance());
		assertEquals(1001, account.getAccountNumber());
		assertEquals(true, account.isActive());
	}
	
	// test case with non existing customer (invalid dummy customerId passed)
	@DisplayName("Test Mock accountService + accountRepository")
	@Test
	void testGetAllAccountsForNonExistingCustomer() {
		assertEquals(0, accountService.getAllAccount(000).size());
	}

}
