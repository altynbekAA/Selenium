package cybertenBnb;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Browser;
import utilities.Config;

public class SignUpPage {
	Browser browser = new Browser();
	private WebDriver driver;
	
	public SignUpPage() {
		this.driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyTitle() {
		String introTitle = Config.getProperty("signUpTitle");
		assertEquals(driver.getTitle(), introTitle, "Intro Page title verification");
	}
	
	
	@FindBy(name="first-name")
	public WebElement firstName;
	
	@FindBy(name="last-name")
	public WebElement lastName;
	
	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//button[.='sign up']")
	public WebElement signUpBtn;
	
	

	
	public void signUp(String firstNameData, String lastNameData, String emailData, String passData) throws InterruptedException {
		Thread.sleep(2_0_0_0);
		firstName.sendKeys(firstNameData);
		Thread.sleep(2_0_0_0);
		lastName.sendKeys(lastNameData);
		Thread.sleep(2_0_0_0);
		email.sendKeys(emailData);
		Thread.sleep(2_0_0_0);
		password.sendKeys(passData);
		Thread.sleep(2_0_0_0);
		signUpBtn.click();

}

	
	
}
	
	
	






	