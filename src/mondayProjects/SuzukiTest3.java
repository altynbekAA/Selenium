package mondayProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SuzukiTest3 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");
         driver = new ChromeDriver();
         driver.get("http://www.suzukicycles.com/");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 1)
	public void veryfyTitle() {
		String expectedTitle = "Suzuki Cycles";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
}
	
	

}





