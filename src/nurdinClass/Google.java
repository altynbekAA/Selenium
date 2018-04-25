package nurdinClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String expected  = driver.getTitle();
		System.out.println(expected);
		driver.findElement(By.id("lst-ib")).sendKeys("keldybek Berdaliev");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
		
		
	
		
			
			
			
		

		
		
		
		
	}

}






