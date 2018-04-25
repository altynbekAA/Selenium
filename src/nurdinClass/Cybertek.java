package nurdinClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.cybertekschool.com");
        driver.findElement(By.id("pseudonym_session_unique_id")).sendKeys("altynbekabdurasulov");
        driver.findElement(By.id("pseudonym_session_password")).sendKeys("19921990altyn");
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.className("menu-item-icon-container")).click();
        driver.findElement(By.className("//*[@id=\"global_nav_profile_header\"]/form/button")).click();
        
        
   
        //driver.quit();

		
		
	}

}





