package com.accounts.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.accounts.helper.TestHelper;
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
	}

	@DisplayName("Test Mock accountService + accountRepository")
	@Test
	void testGetAllAccount() {
		assertEquals(TestHelper.getAccountList().size(), accountService.getAllAccount(201).size());
	}

}
