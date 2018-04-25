package utilities;

import org.openqa.selenium.By;



public class Test {
	public static void main(String[] args) {
		
		Browser.getDriver().get("https://www.google.com/");
		Browser.getDriver().findElement(By.name("q"));
		Browser.getDriver().findElement(By.name("q")).sendKeys("google");
		
		
	}

}








