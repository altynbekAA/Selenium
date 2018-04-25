package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class TestUtilities {

	public static void main(String[] args) throws InterruptedException {
		
			Browser.getDriver().get("https://www.amazon.com");
			Thread.sleep(2000);
			WebElement move = Browser.getDriver().findElement(
			By.xpath("//a[@href='/gp/help/customer/display.html/ref=footer_gw_m_b_he?ie=UTF8&nodeId=508510']"));
		    Page.moveToElement(move);
		    Page.mouseWheel(6);
		    Thread.sleep(2000);		    
		    move.click();
		    
		    
			
		

		
		
	}

}
