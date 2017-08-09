package org.cap.demo;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({BankAppTestCase.class,ParameterizedTestCase.class,
	SampleTest.class})
@IncludeCategory({ReportCategory.class})
@ExcludeCategory({LoginCategory.class})
public class LoginTestCases {

}
