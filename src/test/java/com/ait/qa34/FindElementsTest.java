package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTest {
    WebDriver driver;

    @BeforeMethod
    public void  setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        //wait for all elements on the site to loud before starting the test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void  findElementByTagName(){
// find el by tag name
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());

        WebElement element = driver.findElement(By.tagName("a"));
        System.out.println(element.getText());

//  find list of elements by tag name
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }
	
	@Test
	public void findElementByLocator(){
//  id
		driver.findElement (By.id ("city"));
//  class name
		driver.findElement (By.className ("input-container"));
//  example: name By.name("user")
//	link text -не удачная стратегия
		driver.findElement (By.linkText ("Let the car work"));
		driver.findElement (By.partialLinkText ("work"));
	}
	
	@Test
	public void findElementByCssSelector() {
		//tag name=tag name
		driver.findElement(By.tagName("h1"));
		//id -> #id
		// driver.findElement(By.id("city"));
		driver.findElement(By.cssSelector("#city"));
		//class name -> .className
		// driver.findElement(By.className("input-container"));
		driver.findElement(By.cssSelector(".input-container"));
		//[name='user']
		driver.findElement(By.cssSelector("[for='city']"));
		driver.findElement(By.cssSelector("[href='/search']"));
		//contains -> *
		driver.findElement(By.cssSelector("[href*='car']"));
		//start -> ^
		driver.findElement(By.cssSelector("[href^='/let']"));
		//end on -> $
		driver.findElement(By.cssSelector("[href$='work']"));
	}
//  xPath


@AfterMethod
    public void tearDown(){
        driver.quit();
    }
}



