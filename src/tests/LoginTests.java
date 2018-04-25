package tests;

import java.util.concurrent.TimeUnit;

import javax.security.auth.login.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.*;

import pagesPom.AccountPage;
import pagesPom.HomePage;
import pagesPom.LoginPage;

public class LoginTests {
	
	 WebDriver driver;
		
		@BeforeClass
		public void setup() {
			String driverPath = "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
		}
	
	
	@Test
     public void positiveLoginTest() {
		driver.get("http://automationpractice.com/");
		
		//Create object from Page class:
		HomePage homepage = new HomePage(driver);
		
		//verify logo is displayed 
		Assert.assertTrue(homepage.isAt());
		
		//verify logo displayed
		Assert.assertTrue(homepage.yourLogoIcon.isDisplayed());
		
		homepage.gotoLoginPage();
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isAt());	   
		
		
		assertTrue(loginPage.createACcountlabel.isDisplayed());
		assertTrue(loginPage.alreadyRegisteredLabel.isDisplayed());
		
		loginPage.email.sendKeys("altynbek.92@mail.ru");
		loginPage.password.sendKeys("golden1992");
		loginPage.SubmitLogin.click();
		
		
		AccountPage accountPage = new AccountPage(driver);
		
		

   }
	
	  
	
	
	
	
	
}










