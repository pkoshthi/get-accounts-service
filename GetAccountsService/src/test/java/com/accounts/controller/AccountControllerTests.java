package com.accounts.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.accounts.model.Account;

//account controller tests class with test methods
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AccountControllerTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testGetAllAccount() throws Exception {
		ResponseEntity<List<Account>> response = restTemplate.exchange("http://localhost:" + port + "/account/201",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Account>>() {
				});
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}

}
