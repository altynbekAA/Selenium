package cybertenBnb;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Browser;
import utilities.Config;

public class IntroPage {
	
	WebDriver driver;
	Browser browser = new Browser();
	public IntroPage() {
		this.driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	
		@FindBy(linkText="sign in")
		public WebElement signInBtn;
		
		@FindBy(linkText="sign up")
		public WebElement signUpBtn;
		
		
	
	
	public void verifyTitle() {
		String introTitle = Config.getProperty("introPageTitle");
		assertEquals(driver.getTitle(), introTitle, "Intro Page title verification");
	}
	
	

	
	
	
	
	
}




