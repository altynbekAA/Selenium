package mondayProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SuzukiTest1 {

	WebDriver driver;
	List<String> actualListOfBikesTypes;
	ArrayList<String> listOfBikes2016;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.suzukicycles.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(7000);
		// driver.quit();
	}

	@Test(priority = 1)
	public void veryfyTitle() {
		String expectedTitle = "Suzuki Cycles";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle); // Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@Test (priority =2)
	public void checkSuzukiIcon() {
		Assert.assertTrue(driver.findElement(By.id("suzuki")).isDisplayed());
	}

	@Test(priority = 3)
	public void checkMotorcycleOptions() {
		driver.findElement(By.xpath("//a[@id='cycles']")).click();
		String [] arr = {"SPORTBIEK", "CRUISER", "TOURING", "STANDARD", "ADVENTURE", "DUALSPORT", 
				          "SUPERMOTO", "MOTORCROSS", "OFF ROAD"};
		actualListOfBikesTypes = new ArrayList<>(Arrays.asList(arr));
		List<String> expectedList = new ArrayList<>();
		
		List<WebElement> allElements = driver.findElements(By.tagName("h2"));
		for(WebElement element : allElements) {
			expectedList.add(element.getText());
		}
		
		Assert.assertEquals(actualListOfBikesTypes, expectedList);
		
		
		}
	
	
	@Test (priority = 4)
	public void verify2016MotoOptions() {
		listOfBikes2016 = new ArrayList<>();
		driver.findElement(By.id("body_0_rptYears_yearItem_2")).click();
		List<WebElement> bikeTypes = driver.findElements(By.tagName("h2"));
		for(WebElement bike: bikeTypes) {
			listOfBikes2016.add(bike.getText());
		}
		Assert.assertEquals(actualListOfBikesTypes, listOfBikes2016);
		
	}

	}
	
	
	
	










