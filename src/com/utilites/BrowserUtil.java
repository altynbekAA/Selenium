package com.utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserUtil {
	public static void verifyCheckBoxSelected(WebElement chechbox) {
		if(chechbox.isSelected()) {
        	System.out.println("Pass");
        }else {
        	System.out.println("Fail");
        }
	}
	public static void verifyCheckBoxNotSelected(WebElement chechbox) {
		if(chechbox.isSelected()) {
        	System.out.println("Pass");
        }else {
        	System.out.println("Fail");
        }
	}
	
	public void Select (WebElement checkbox) {
		if(checkbox.isSelected()) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	
	public static void verifyTitleCotains(WebDriver driver, String expected) {
		String actual = driver.getTitle();
		if(actual.toLowerCase().contains(expected.toLowerCase())) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			System.out.println("Expected: "+expected);
			System.out.println("Actual: "+actual);
		}
	
	}

}






