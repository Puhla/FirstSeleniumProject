import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class FindElDemoWebShopTest {
WebDriver driver;


@BeforeMethod
public void setUp () {
	driver = new ChromeDriver ();
	driver.get ("https://demowebshop.tricentis.com");
	driver.manage ().window ().maximize ();
	driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
}

@Test
public void findElementByTagName () {
	WebElement form = driver.findElement (By.tagName ("form"));
	System.out.println (form.getText ());
	
	WebElement element = driver.findElement (By.tagName ("span"));
	System.out.println (element.getText ());
	
	WebElement register = driver.findElement (By.tagName("li"));
	System.out.println (register.getText ());
}
@Test
public void findElementByCssSelector(){
	//driver.findElement ()
	driver.findElement (By.cssSelector ("#dialog-notifications-error"));
	driver.findElement (By.cssSelector("#flyout-cart"));
	driver.findElement (By.cssSelector("#dialog-notifications-error"));
	driver.findElement (By.cssSelector("#bar-notification"));
	driver.findElement (By.cssSelector("[href='/register']"));
	driver.findElement (By.cssSelector("li.inactive>[href='/computers']"));
	driver.findElement (By.cssSelector("span.close"));
	driver.findElement (By.cssSelector("[href='/login']"));
	driver.findElement (By.cssSelector(".count"));
	driver.findElement (By.cssSelector(".header-menu"));

}

@Test
public void findElementByXpath() {
	driver.findElement (By.xpath ("//*[@id='dialog-notifications-error']"));
	driver.findElement (By.xpath ("//*[@id='flyout-cart']"));
	driver.findElement (By.xpath ("//*[@id='bar-notification']"));
	driver.findElement (By.xpath ("//*[href='/register']"));
	driver.findElement(By.xpath("//li[@class='inactive']/a[@href='/computers']"));
	driver.findElement(By.xpath("//span[@class='close']"));
	driver.findElement(By.xpath("//a[@href='/login']"));
	driver.findElement(By.xpath("//*[@class='count']"));
	driver.findElement(By.xpath("//*[@class='header-menu']"));

	
	
}

@AfterMethod
public void tearDown () {
	driver.quit ();
}

}

