package com.ait.qa34;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTest extends TestBase {

@Test//(enabled = false)
public void createNewAccountPositiveTest () {
	Random random= new Random ();
	int i = random.nextInt (1000)+1000;
	//click on Register
	click (By.cssSelector ("[href='/register']"));
	//enter first name
	type (By.name ("FirstName"), "Roman");
	
	//enter last name
	type (By.name ("LastName"), "Romanov");
	
	//enter email
	type (By.name ("Email"), "romanov" + 48+ "@gmail.com");
	
	//enter Password
	type (By.name ("Password"), "$Roma!$1");
	
	//enter Confirm password
	type (By.name ("ConfirmPassword"), "$Roma!$1");
	
	//click on the button Register
	click (By.cssSelector ("[id='register-button']"));
	//click (By.cssSelector (".register-continue-button"));
	
	
	//assert
	Assert.assertTrue (isElementPresent (By.cssSelector ("div:nth-child(1) ul:nth-child(1)  [class='account']")));
	
}


}