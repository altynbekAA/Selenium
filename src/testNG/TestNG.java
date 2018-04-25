package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNG {
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.zillow.com/mortgage-calculator/");
	
	driver.findElement(By.id("inputs-zipCode")).sendKeys("6045");
	driver.findElement(By.xpath("//*[@id=\"zmm-calc-payment\"]/section[2]/div/aside/div/form/button")).click();
	
	String expected = "https://www.zillow.com/mortgage-calculator/";
	String actual = driver.getTitle();
	Assert.assertSame(actual, expected, "Done");
	
	
	
	
	
	
	
	
	
	
	
	}

}
