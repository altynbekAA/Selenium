package allerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PopUpChicago {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("Setting up for selenum");
		String driverPath = "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();

	}

	@Test
	public void popup() throws InterruptedException {
		driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
		driver.findElement(By.xpath("//span[.='Destroy the World']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Yes']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[.='Ajax Core']")).click();
		driver.quit();

	}

}








