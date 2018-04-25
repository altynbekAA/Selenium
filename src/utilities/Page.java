package utilities;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Page {
	
	public static void moveToElement(WebElement element) {
		Actions action = new Actions(Browser.getDriver());
		action.moveToElement(element).perform();
	}
	
	/**
	 * This method accepts integer positive for mouse back negative for mouse forward 
	 * Give somewhere between -5 to 5
	 * @param scrolls
	 */
	
	public static void mouseWheel(int scrolls) {
		try {
			Robot robot = new Robot();
			robot.mouseWheel(scrolls); 
		} catch (AWTException e) {
			System.out.println(e.getMessage());
			System.out.println("Could not scroll the mouse");
		}
	}
	
	

}









