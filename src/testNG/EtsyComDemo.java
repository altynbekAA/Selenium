package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EtsyComDemo {
	
	WebDriver driver;
	
	@BeforeClass
	public void EtsyDemo() {
		System.setProperty("webdriver.chrome.driver", "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");
		driver = new ChromeDriver();
		
		
		
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(7000);
		//driver.quit();
	}
	
	@Test (priority = 1) 
	public  void SearchWord() {
		driver.get("https://www.etsy.com/");
		driver.findElement(By.id("search-query")).sendKeys("watch");
		driver.findElement(By.xpath("//*[@id=\"gnav-search\"]/div/div[2]/button")).click();
		
		
		
		
	}
	
	
	

}






