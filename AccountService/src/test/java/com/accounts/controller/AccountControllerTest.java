package com.accounts.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.accounts.model.Account;
import com.accounts.service.AccountService;

public class AccountControllerTest {
	/*
	 @Test
	public void testFindTheGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}
	 */
/*	
	@Test
	public void testGetAllAccount()
	{
		AccountService accountServiceMock = mock(AccountService.class);
		List<Account> accounts=new ArrayList<Account>();
		Account account1 = new Account(1001,"Saving",true,2000.00,201);
		Account account2 = new Account(1002,"Current",true,3000.00,201);
		accounts.add(account1);
		accounts.add(account2);
		when(accountServiceMock.getAllAccount(Mockito.anyInt())).thenReturn(accounts);
		List<Account> accountList = accountServiceMock.getAllAccount(201);
		verify(accountServiceMock.getAllAccount(Mockito.anyInt()), times(1));
		
	}
*/
}
