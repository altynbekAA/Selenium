package synchronization;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class ImplicitWait {
    WebDriver driver;
	
	@BeforeClass
	public void setup() {
		String driverPath = "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
	}

	//@Test 
	public void implicitWait() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.id("btn")).click();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(50000);     
		
		WebElement message = driver.findElement(By.id("message"));
		System.out.println(message.getText());
				
	}
	
	
	//@Test 
	public void explicitWait() {
		driver.get("http://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.id("btn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 8);
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message"))));
		
		WebElement message = driver.findElement(By.id("message"));
		System.out.println(message.getText());
		
	}
	
	//@Test
	public void explixit() {
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.id("//*[@id='start']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 8);   ////div[@id='finish']
		

		WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']")));
		System.out.println(message.getText());

		
	}
	
	//@Test
	public void js() throws InterruptedException {
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.prompt(\"Please enter you name\",\"\");");
		Thread.sleep(2000);
		Alert custom = driver.switchTo().alert();
		
		custom.sendKeys("James Bond");
		custom.accept();
		js.executeScript("window.scrollBy(0,5000)");
		driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html/ref=footer_privacy?ie=UTF8&nodeId=468496']")).click();


		
	}
	
	//@Test 
	public void javaScript() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html/ref=footer_privacy?ie=UTF8&nodeId=468496']")).click();
		
		
		
		
	}
	
	@Test 
	public void fluentWait() {
		driver.get("http://the-internet.herokuapp.com/dynamic_controls");

		driver.findElement(By.id("bnt")).click();
		
		WebElement message = FluentUtil.getElementWithWait(By.id("message"), 15, 2, driver);
	}
	
	
	
	
	
	
}













