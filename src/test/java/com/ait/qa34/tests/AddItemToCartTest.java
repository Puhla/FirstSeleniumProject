package com.ait.qa34.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest extends TestBase {
@BeforeMethod
public void ensurePrecondition () {
	clickOnLoginLink ();
	fillLoginOnReturningCustomerForm("romanov@gmail.com", "$Roma!$1");
	clickOnLoginInButton ();
	Assert.assertTrue (isHeaderLinksPresent ());
}

@Test
public void addToCart() {
	//driver.findElement(By.id("nivo-slider"));
	click (By.cssSelector
			(".item-box:nth-child(3) .buttons"));
	clickOnTopCartLink ();
	Assert.assertTrue (isQuantityOfProduct ());
}

}

