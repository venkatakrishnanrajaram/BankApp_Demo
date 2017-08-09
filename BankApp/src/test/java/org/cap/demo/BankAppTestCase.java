package org.cap.demo;

import static org.junit.Assert.*;

import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BankAppTestCase {
	
	private AcccountService accountService;
	@Before
	public void setUp(){
		//System.out.println("Before Method");
		accountService=new AccountServiceImpl();
	}

	
	@After
	public void tearDown(){
		//System.out.println("After Method");
		//accountService=new AccountServiceImpl();
	}
	
	@Category(LoginCategory.class)
	@Test
	public void test_addNumbers() {
		
		Assert.assertEquals(55, 
				accountService.addNumbers(10, 45));
	}
	
	@Category(LoginCategory.class)
	@Test(expected=IllegalArgumentException.class)
	public void test_addAccount_with_null_customer() 
			throws InvalidInitialAmountException{
		//accountService=new AccountServiceImpl();
		Customer customer=null;
		accountService.addAccount(customer, 1000);
	}
	
	
	@Category(ReportCategory.class)
	@Test(timeout=300)
	public void test_myLoop(){
		accountService.myLoop();
	}
	
	
	
	
	

}
