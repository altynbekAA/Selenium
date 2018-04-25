package cityOfChicago;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Selenium;

public class HomePage {

	public static WebDriver driver;
	
	
	
	public HomePage(WebDriver driver) {
		HomePage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Pay For/Buy')]")
	public WebElement ticketsPay;

	public WebElement payFor;
	public static List<String> handles = Selenium.getListOfHandles(driver);
	public static String handle = driver.getWindowHandle();
	

	public void goToTikckets() {
		ticketsPay.click();
		
		payFor = driver.findElement(By.xpath("(//a[@title='Parking, Red Light, or Speed Ticket(s)'])[4]"));
		payFor.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
