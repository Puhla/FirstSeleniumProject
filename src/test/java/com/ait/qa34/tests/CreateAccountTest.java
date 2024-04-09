package com.ait.qa34.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTest extends TestBase {
//@BeforeMethod
//public void ensurePrecondition(){
//	if(!isElementPresent (By.className ()))
//}

@Test//(enabled = false)
public void createNewAccountPositiveTest () {
	Random random= new Random ();
	int i = random.nextInt (1000)+1000;
	clickOnRegisterLink ();
	fillRegisterForm (i);
	clickOnRegisterButton ();
	//assert
	Assert.assertTrue(isRegisterLinkPresent ());
	
}

	
}