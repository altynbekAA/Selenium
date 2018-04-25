package cybertenBnb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Cybertek {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("Setting up for selenum");
		String driverPath = "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	}

	@Test(priority = 1)
	public void alert1(WebDriver driver, String firstName, String lastName, String email, String pass) throws InterruptedException {
		driver.get("http://cybertek-bnb.herokuapp.com/intro");
		driver.findElement(By.xpath("//a[@href='/sign-up']")).click();
		driver.findElement(By.xpath("//input[@placeholder='first-name']")).sendKeys(firstName);
		Thread.sleep(2_0_0_0);
		driver.findElement(By.xpath("//input[@placeholder='last-name']")).sendKeys(lastName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button is-dark']")).click();

	}
	
	

}
