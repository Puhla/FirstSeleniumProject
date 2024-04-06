package com.ait.qa34;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

@Test//(enabled = false)
public void createNewAccountPositiveTest () {
	//click on Register
	click (By.cssSelector ("[href='/register']"));
	//enter first name
	type (By.name ("FirstName"), "Roman");
	
	//enter last name
	type (By.name ("LastName"), "Romanov");
	
	//enter email
	type (By.name ("Email"), "romanov@gmail.com");
	
	//enter Password
	type (By.name ("Password"), "$Roma!$1");
	
	//enter Confirm password
	type (By.name ("ConfirmPassword"), "$Roma!$1");
	
	//click on the button Register
	click (By.cssSelector ("[id='register-button']"));
	
	//assert Continue button is Present
	Assert.assertTrue (isElementPresent (By.cssSelector (".register-continue-button")));
	
}


}