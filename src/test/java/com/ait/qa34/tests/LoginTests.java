package com.ait.qa34.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
@Test
public void loginPositiveTest(){
clickOnLoginLink ();
fillLoginOnReturningCustomerForm("romanov@gmail.com", "$Roma!$1");
clickOnLoginInButton ();
Assert.assertTrue (isHeaderLinksPresent ());
}

}
