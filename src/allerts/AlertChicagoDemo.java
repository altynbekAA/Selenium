package allerts;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertChicagoDemo {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.out.println("Setting up for selenum");
		String driverPath = "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
	}
	
	@Test 
	public void Dem01() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/");		
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();		
		String key = "Cybertek";
		Thread.sleep(2000);
		
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Cybertek");
		Thread.sleep(2000);
		
		alert3.accept();
		WebElement result = driver.findElement(By.id("result"));
		Thread.sleep(2000);
		Assert.assertEquals(result.getText(), "You entered: "+key);
		
		
	}

}






