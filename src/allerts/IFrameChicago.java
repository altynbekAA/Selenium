package allerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IFrameChicago {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("Setting up for selenum");
		String driverPath = "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();

	}
	

//	@Test
	public void iFrame() {
		
		driver.get("http://toolsqa.com/iframe-practice-page");
		//driver.switchTo().frame("315");
		//WebElement secondframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		
		//driver.switchTo().frame(secondframe);
		//actions		
		//driver.switchTo().parentFrame();   //same <--		driver.switchTo().defaultContent();
	
	}
	@Test
	     public void iFrame2() throws InterruptedException {
		
		driver.get("http://toolsqa.com/iframe-practice-page");
		Thread.sleep(2000);
		driver.switchTo().frame("iframe2");
		WebElement iFramecontent  = driver.findElement(By.id("primary"));
		System.out.println(iFramecontent.getText());
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Home")).click();
		
	
	
	
	}
}







