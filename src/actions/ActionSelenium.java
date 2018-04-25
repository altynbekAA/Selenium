package actions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionSelenium {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.out.println("Setiing up for selenium");
		System.setProperty("webdriver.chrome.driver", 
				"/Users/altynbekabdurasulov/selenium depen/driver/chromedriver");		
		driver = new ChromeDriver();
	    
		
	}

	@Test  (priority = 1)
	public void amazonHoverOver()  {
		driver.get("https://www.amazon.com");
		WebElement loginIn = driver.findElement(By.xpath("//span[.='Hello. Sign in'][2]"));
		Actions action = new Actions(driver);
		action.moveToElement(loginIn).perform();
		
//		WebElement bottomLink = driver.findElement(By.linkText("Sign in to see personalized recommendations"));
//		System.out.println("Link: "+bottomLink.getText());
//		Thread.sleep(2000);
//        action.moveToElement(bottomLink).perform();
	} 
		@Test (priority = 2)
		public void doubleClick2() throws InterruptedException {
			
       // action.doubleClick();
		driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
        WebElement fold = driver.findElement(By.id("fold_header"));
        Actions action2 = new Actions(driver);
        Thread.sleep(2000);
        action2.doubleClick(fold).perform();
        
        
		
        
		}
		
		@Test  (priority = 3)
		public void Dragon() {
			driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index?_ga=2.59644905.539847569.1518665237-1214720904.1518665237#");
	        WebElement source = driver.findElement(By.id("draggable"));
	        WebElement target = driver.findElement(By.id("droptarget"));
	        
	        Actions action3 = new Actions(driver);
	        action3.dragAndDrop(source, target).perform();
	        


		}
		
		@Test  (priority = 4)
		public void FileUploder() throws InterruptedException {
			driver.get("http://the-internet.herokuapp.com/upload");
			WebElement upload = driver.findElement(By.id("file-upload"));
			Thread.sleep(2000);
			upload.sendKeys("/Users/altynbekabdurasulov/Documents/FirstVariable");
			Actions action = new Actions(driver);
			action.moveToElement(upload).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.id("file-submit")).click();
			
		}
		
	}
	




