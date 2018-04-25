package nurdinClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	

		@Test (priority = 1)
		public void test1() {
	    System.out.println("Selenium setting");		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement>  devices = driver.findElements(By.cssSelector("navFooterLinkCol navAccessibility\"]:nth-child(3)"));
		
		
		List<WebElement> makeMoneyWithUs = devices.get(2).findElements(By.cssSelector("li"));
		List<WebElement> AmazonPaymnetsProducts = devices.get(3).findElements(By.cssSelector("li"));

		
		System.out.println("Size = "+devices.size());
		
		for(WebElement device: devices) {
			String deviceName = device.getText();
			if(deviceName.equals("Sell on Amazon")) {
				device.click();
			}
		}
		
		
		}
	

}


