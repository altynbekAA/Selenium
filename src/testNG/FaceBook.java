package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBook {
	
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Very before class set up for selenium");
		System.setProperty("webdriver.chrome.driver", "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
	
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before every test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After every test method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After all test method");
	}

	@Test
	public void testTest1() {
		driver.get("https://www.facebook.com/");
		String expected = "Facebook.com";
		String actual = driver.getTitle();
		Assert.assertSame(actual, expected, "Done");
		
	}

	@Test
	public void testTest2() {
		System.out.println("Test2 method running");
		driver.quit();
	}
	

}
