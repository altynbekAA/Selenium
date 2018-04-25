package allerts;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class AlertChicago {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.out.println("Setting up for selenum");
		WebDriver driver = new ChromeDriver();
		
		
	}

	
	@Test (priority = 1)
	public void alertFirst() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		WebElement button1 = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
		Thread.sleep(2000);
		button1.click();		
		
		Alert alert1 = driver.switchTo().alert();
		String alert1Message = alert1.getText();
		System.out.println(alert1Message);
		
		Thread.sleep(2000);
        alert1.accept();
        alert1.dismiss();
        
        WebElement result = driver.findElement(By.id("result"));
		
		
	}
	
	//@Test (priority = 2)
		public void alertSecond() throws InterruptedException {
			driver.get("http://the-internet.herokuapp.com/javascript_alerts");
			WebElement button2 = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
			Thread.sleep(2000);
			button2.click();	
			
			Alert alert2 = driver.switchTo().alert();
            alert2.accept();
            
            WebElement result = driver.findElement(By.id("result"));
            Assert.assertEquals(result.getText(), "You clicked: Ok");
            
            button2.click();	
			Thread.sleep(1000);
	        alert2.dismiss();
	        
	        WebElement result2 = driver.findElement(By.id("result"));
            Assert.assertEquals(result2.getText(), "You clicked: Cancel");

			
 
		}
	
	//@Test (priority = 3)
	public void alertThird() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		WebElement button3 = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
		Thread.sleep(2000);
		button3.click();	
		
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(), "You entered:");
        
        //scenario 2
		Thread.sleep(2000);
		button3.click();
		alert3.dismiss();
        WebElement result2 = driver.findElement(By.id("result"));
        Assert.assertEquals(result2.getText(), "You entered: null");
        
        //scenario 3
		Thread.sleep(2000);
		String key = "test";
		button3.click();
		alert3.sendKeys(key);
		alert3.accept();
		
        Assert.assertEquals(result.getText(), "You entered: "+key);
        


	}
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	












