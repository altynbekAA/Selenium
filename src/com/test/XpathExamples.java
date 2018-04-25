package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilites.BrowserUtil;

public class XpathExamples {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        //verify first is not and second is selected
        WebElement one = driver.findElement(By.xpath("/html/body/div/div/div/form/input[1]"));
        WebElement two = driver.findElement(By.xpath("/html/body/div/div/div/form/input[2]"));

        
        BrowserUtil.verifyCheckBoxNotSelected(one);             
        BrowserUtil.verifyCheckBoxSelected(two);       
        
        one.click();       
        BrowserUtil.verifyCheckBoxSelected(one);
        BrowserUtil.verifyCheckBoxSelected(two);
        
        two.click();
        BrowserUtil.verifyCheckBoxSelected(one);
        BrowserUtil.verifyCheckBoxNotSelected(two);
        
 
        //System.out.println(two.isSelected());
        //driver.findElement(By.xpath("/html/body/div/div/div/form/input[2]")).click();        
        
	}

	

}





