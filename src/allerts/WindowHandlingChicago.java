package allerts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowHandlingChicago {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("Setting up for selenum");
		String driverPath = "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();

	}
	
	@Test 
	public void windowHandling() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/windows");		
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);

		driver.findElement(By.linkText("Click Here")).click();
		
		//driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		Thread.sleep(2000);
		System.out.println("Size: "+driver.getWindowHandles().size());
		List<String> handles = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window("windowID");
		Thread.sleep(2000);

		System.out.println("Title: "+driver.getTitle());
		String mainHandle = driver.getWindowHandle();
		
		
		for(String id: handles) {
			System.out.println("ID: "+id);
			if(!id.equals(mainHandle)) {
				driver.switchTo().window(id);
			break;
		}
	}
	    System.out.println("Title: "+driver.getTitle());
	   
	}
}







