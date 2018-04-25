package nurdinClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumLocatros {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://accounts.google.com/");
		String signin = driver.findElement(By.id("headingText")).getText();

		//signin.equals("Sign in");

		System.out.println(verify("Sign in", signin));		
		System.out.println(signin);
		
		driver.findElement(By.id("identifierId")).sendKeys("huzintaogold@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);

		String welcome = driver.findElement(By.id("headingText")).getText();
		//welcome.equals("Welcome");
		System.out.println(verify("Welcome",welcome));
		System.out.println(welcome);
		
		driver.findElement(By.name("password")).sendKeys("abdurasulov1966");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.quit();

		
		
		

	}

	public static boolean verify(String expectedResult, String actualResult) {
		if (expectedResult.equals(actualResult))
			return true;
		else
			return false;
	}

}
