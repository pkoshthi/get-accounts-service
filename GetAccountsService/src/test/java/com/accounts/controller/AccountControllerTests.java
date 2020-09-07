package com.accounts.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.accounts.helper.TestHelper;
import com.accounts.model.Account;
import com.accounts.service.AccountService;

//account controller tests class with test methods
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AccountControllerTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Mock
	private AccountService accountService;
	
	@BeforeEach
	void setMockOutput() {
		when(accountService.getAllAccount(201)).thenReturn(TestHelper.getAccountList());
	}

		
	// test case with mock data
	@DisplayName("Test Mock accountService")
	@Test
	public void testGetAllAccountWithMockData() throws Exception {
		List<Account> customeraccounts = accountService.getAllAccount(201);
		Account account = customeraccounts.get(0);
		assertEquals(201, account.getCustomerId());
		assertEquals("Savings",account.getAccountType());
		assertEquals(2000.00,account.getBalance());
		assertEquals(1001, account.getAccountNumber());
		assertEquals(true, account.isActive());
	}
	
	
	// test case which verifies customerId passed is not existing one(dummy integer passed)
	@DisplayName("Test which verifies the customerId passed is not valid one")
	@Test
	public void testGetAllAccountEndPoint() throws Exception {
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:" + port + "/account/201",
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				});
		assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
	}
	
	
	// test case for invalid input for customerId path parameter
	@DisplayName("Test which verifies BAD_REQUEST for GetAccountsService end point")
	@Test
	public void testGetAllAccountBadRequest() throws Exception {
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:" + port + "/account/abc",
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				});
		assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
	}
	
	
	// test case for no customerId passed as path parameter
	@DisplayName("Test which verifies NOT_FOUND for GetAccountsService end point(No value passed for path parameter)")
	@Test
	public void testGetAllAccount404ResponseCode() throws Exception {
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:" + port + "/account/",
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				});
		assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
	}

}
