package testNG;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTest {
	
	private ChromeDriver driver;

	@BeforeClass
	public void serup() {
		System.out.println("Setting up for selenium");
		String driverPath = "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver";
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
	
	}
	@Test 
	public void goodleTitletTest() {
		driver.get("https://www.google.com/");
		String  expectedTitle = "google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals (actualTitle,expectedTitle, "Google title verificatio failed");
	}
	
	@Test 
	public void goodleURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}







