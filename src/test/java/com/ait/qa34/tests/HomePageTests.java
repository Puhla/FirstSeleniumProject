package com.ait.qa34.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTests extends TestBase{

WebDriver driver;

@BeforeMethod
public void setUp () {
	driver = new ChromeDriver ();
	driver.get ("https://demowebshop.tricentis.com");
	driver.manage ().window ().maximize ();
	driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
}
@AfterMethod
public void tearDown () {
	driver.quit ();
}

@Test
public void isHomeComponentPresent(){
	driver.findElement (By.cssSelector (".header-logo"));
}

}