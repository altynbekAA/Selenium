package mondayProjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sun.glass.ui.Window;

public class PHP {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("Setting up for selenum");
		String driverPath = "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@Test (priority = 1)
	public void alert1() throws InterruptedException {
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='//www.phptravels.net']")).click();
		
		List<String> newTab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='row']//li[@id='li_myaccount']/a")).click();	
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='form-control padding-10'])[1]")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@type='password']")).sendKeys("demouser");
		driver.findElement(By.xpath("//button[@style='margin-top: -16px; border-radius: 0px;height: 70px; font-size: 16px;']")).click();
		
		Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("(//*[@class='btn btn-action btn-block'])[1]"));
		Thread.sleep(2000);
        
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		Thread.sleep(2000);
		
		
		
		List<String> newTab2 = new ArrayList<>(driver.getWindowHandles());
		driver.close();    //7
		driver.switchTo().window(newTab2.get(2));
		
		
		String hotelInfo = driver.findElement(By.xpath("(//td[@bgcolor='#eeeeee'])[1]")).getText();
		String deposit = driver.findElement(By.xpath("(//tr[@style='width:100%']//td[@align='left'])[2]")).getText();
		String tax = driver.findElement(By.xpath("(//td[@width='33.3%'])[5]")).getText();
		String Totalamount = driver.findElement(By.xpath("(//td[@width='33.3%'])[6]")).getText();
		String bookingCode = driver.findElement(By.xpath("(//div[@style='font-size: 12px !important;height: 14px;'])[3]")).getText();
		System.out.println("booking code :"+bookingCode);
		
		//System.out.println("hotelInfo: "+hotelInfo+"  deposit: "+deposit+"  tax: "+tax+"  amount: "+amount);
		
		//hotelInfo
		hotelInfo = hotelInfo.trim();
		
		//deposit
		deposit = deposit.trim();
		deposit = deposit.substring(4);
		
		//tax
		tax = tax.trim();
		tax = tax.substring(4);
		//System.out.println(tax);
		
		//amount
		Totalamount = Totalamount.trim();
		Totalamount = Totalamount.substring(4);
		
		//bookingCode
		bookingCode=bookingCode.trim();
		bookingCode= bookingCode.substring(bookingCode.length()-4);
		
		List<String> windowSwith = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowSwith.get(0));
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("ADMIN")).click();
		Thread.sleep(2000);
		
		List<String> windowSwith3 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowSwith3.get(2));
		
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");		
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='xcrud-search-toggle btn btn-default']")).click();
		Thread.sleep(2000);
		
		WebElement refNo = driver.findElement(By.xpath("//select[@name='column']"));
		Thread.sleep(2000);
		
		Select select = new Select(refNo);
		Thread.sleep(2000);
		select.selectByVisibleText("Ref No.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phrase']")).sendKeys(bookingCode);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='xcrud-action btn btn-primary']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@class='fa fa-edit']")).click();
		
		//Hotel info
		WebElement expectedHotelInfo = driver.findElement(By.xpath("//span[@id='itemtitlesum']"));
		Assert.assertEquals(hotelInfo, expectedHotelInfo.getText());
		
		//Tax
		WebElement expectedTax = driver.findElement(By.xpath("//*[@id='displaytax']"));
		Assert.assertEquals("5202.25", expectedTax.getText());
		//System.out.println(expectedTax.getText());
		
		//Depsoit
		WebElement expectedDeposit = driver.findElement(By.xpath("//*[@id='topaytotal']"));
		Assert.assertEquals(deposit, expectedDeposit.getText());
		
		//Totalamount
		WebElement expectedTotalamount = driver.findElement(By.xpath("//*[@id='grandtotal']"));
		Assert.assertEquals(Totalamount, expectedTotalamount.getText());
		


	}
	
	
	
	
	
	
	

	
	
}






