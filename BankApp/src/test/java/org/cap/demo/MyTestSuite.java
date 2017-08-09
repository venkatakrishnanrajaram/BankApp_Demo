package org.cap.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BankAppTestCase.class, 
	ParameterizedTestCase.class })
public class MyTestSuite {

}
