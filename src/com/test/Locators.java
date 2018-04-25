package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        //<input 								<input
               //type ="email"                        type ="email"       
               //class ="inputtext"                   class ="inputtext"
               //name ="email"                        name ="email"
               //id = "email"						 id = "email"
               //tabindex ="1"                        tabindex ="1"
               //data-testid="royal_email">           data-testid="royal_email">
        
        //driver.get("http://facebook.com");
        //driver.findElement(By.id("email")).sendKeys("dawdawdawd");
        //driver.findElement(By.id("pass")).sendKeys("123123123");
        
        //driver.findElement(By.name("Email")).sendKeys("asdasd");
        //driver.findElement(By.name("pass")).sendKeys("asdasd");
        //tagname
        //driver.get("https://the-internet.herokuapp.com/forgot_password");
        //driver.findElement(By.tagName("input")).sendKeys("asdasd");
        //driver.findElement(By.className("radius")).click();
        
        
        // partiallinkText = uses the part of text of the link
        driver.get("http://the-internet.herokuapp.com/");
        //driver.findElement(By.linkText("Sell on Etsy")).click();
        driver.findElement(By.partialLinkText("/checkboxes")).click();



       
        
        
        
        
	}

}






