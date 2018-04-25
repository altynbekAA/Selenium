package mondayProjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.Browser;
import utilities.Config;

public class phpDone {
	
	WebDriver driver;

	Browser browser = new Browser();
	@BeforeClass
	public void setup() {
		driver = Browser.getDriver();
		driver.get(Config.getProperty("url"));
	}   
	@Test
	public void PhpTravel() {
	    String mainTab = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href='//www.phptravels.net']")).click();
		
		List<String> newTab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		System.out.println(driver.getCurrentUrl());
		
		Browser.sleep(4000);
		driver.findElement(By.xpath("//div[@class='row']//li[@id='li_myaccount']/a")).click();	
		driver.findElement(By.linkText("Login")).click();
	    
		
	}
	
	
	
	


	

}












