package org.cap.demo;

import org.cap.dao.AccountDao;
import org.cap.dto.Account;
import org.cap.dto.Customer;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockitoTestCase {
	
	private AcccountService accountService;
	
	@Mock
	private AccountDao accountDao;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		
		accountService=new AccountServiceImpl(accountDao);
	}
	
	
	@Test
	public void test_findAccountById(){
		//Declarion
		Account account=new Account();
		account.setAccountNo(1001);
		Customer customer=new Customer();
		customer.setCustName("Tom");
		account.setCustomer(customer);
		account.setAmount(5000);
		
		Mockito.when(accountDao.findAccountById(1001))
				.thenReturn(account);
		
		
		//Actual
		Account rec_account= accountService.findAccountById(1001);
		
		Mockito.verify(accountDao).findAccountById(1001);
		Assert.assertEquals(5000, rec_account.getAmount(),0.0);
		
	}

}
