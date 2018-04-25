package pagesPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage {
	 WebDriver driver;
	 
	 public HomePage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(linkText="Sign In")
	 public WebElement signInLink;
	 
	 @FindBy(xpath = "//img[@class='logo img-responsive']")
	 public WebElement yourLogoIcon;
		
	
	 public boolean isAt() {
		 return driver.getTitle().equals("My Store");
	 }
	 
	 public void gotoLoginPage() {
		 signInLink.click();
	 }
	 
	 

}











