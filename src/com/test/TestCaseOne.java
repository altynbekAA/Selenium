package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilites.BrowserUtil;

public class TestCaseOne {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com/");
		String searchTerm = "charger";
		
		driver.findElement(By.id("search-query")).sendKeys("charger");
		driver.findElement(By.xpath("//*[@id=\"gnav-search\"]/div/div[2]/button")).click();
		
		//String actualTitle = driver.getTitle();
		
		BrowserUtil.verifyTitleCotains(driver, searchTerm);


		
		//driver.findElement(By.xpath("/html/body")).click();
		//driver.quit();
		
		
	

		
		

		
		
		
		
		
		
	}

}




