package com.ait.qa34.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
WebDriver driver;
@BeforeMethod
public void setUp() {
	driver = new ChromeDriver ();
	driver.get ("https://demowebshop.tricentis.com");
	driver.manage ().window ().maximize ();
	driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
}
@AfterMethod(enabled = false)
public void tearDown(){
	driver.quit ();
}

//универсальный метод -> находит хотя бы один элемент
public boolean isElementPresent(By locator){
	return driver.findElements (locator).size () > 0;
}
public void type (By locator, String text) {
	click (locator);
	driver.findElement (locator).clear ();
	driver.findElement (locator).sendKeys (text);
}

public void click (By locator) {
	driver.findElement (locator).click ();
}
public boolean isAlertPresent(){
	Alert alert =new WebDriverWait (driver, Duration.ofSeconds (15))
			.until (ExpectedConditions.alertIsPresent ());
	if (alert == null) {
		return false;
	}else {
		return true;
	}
}


public void fillLoginOnReturningCustomerForm(String email, String password)  {
	int i;
	type (By.name ("Email"), email);
	type (By.name ("Password"), password);
}
public void clickOnLoginLink () {
	click(By.cssSelector(".ico-login"));
}





protected void clickOnLoginInButton () {
	click(By.cssSelector (".login-button"));
}
public void clickOnRegisterButton () {
	click (By.cssSelector ("[id='register-button']"));
}

public void fillRegisterForm (int i) {
	type (By.name ("FirstName"), "Roman");
	type (By.name ("LastName"), "Romanov");
	type (By.name ("Email"), "romanov" + i + "@gmail.com");
	type (By.name ("Password"), "$Roma!$1");
	type (By.name ("ConfirmPassword"), "$Roma!$1");
}

public void clickOnRegisterLink () {
	
	click (By.cssSelector ("[href='/register']"));
}

public boolean isRegisterLinkPresent () {
	return isElementPresent ( By.cssSelector ("ul:nth-child(1) .account"));
}


public boolean isHeaderLinksPresent () {
	return isElementPresent (By.cssSelector (".header-links-wrapper"));
}

protected void clickOnTopCartLink () {
	click (By.cssSelector ("[id=topcartlink]"));
}

public boolean isQuantityOfProduct () {
	return isElementPresent (By.xpath ("//tbody/tr[1]/td[5]/input[1]"));
}
}
