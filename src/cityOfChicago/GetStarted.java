package cityOfChicago;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStarted {

	WebDriver driver;
	
	public GetStarted(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String handle = driver.getWindowHandle();
	
	@FindBy(linkText = "Get Started Online")
	public WebElement getStartedOnline;
	
	public void swithToSearchForPage() {
		getStartedOnline.click();
		
		for(String str: HomePage.handles) {
			if(!str.equals(handle)) {
				driver.switchTo().window(str);
			}
		}
		
		
	}
	
	

	
	
}












