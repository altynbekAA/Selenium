package cybertenBnb;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Browser;
import utilities.Config;
import utilities.Page;

public class CybertekBnB {
Browser browser = new Browser();
	@Test (priority = 1)
	public void titleTest() {
		String url = "http://cybertek-bnb.herokuapp.com";
		Browser.getDriver().get(Config.getProperty("url"));	
		new IntroPage().verifyTitle();
		
	}
	    @Test(priority =2)
	    public void uselessTest() {
	    	System.out.println("This is useless Test");
	    }
	
	
	
	@Test (priority = 3)
	public void titleVerification() throws InterruptedException {
		Browser.getDriver().findElement(By.linkText("sing up")).click();
		SignUpPage sup = new SignUpPage();
		sup.verifyTitle();
	}
	
	
	@Test (priority =4)
	public void signUpTest() throws InterruptedException {
		SignUpPage sup = new SignUpPage();
		String name = Config.getProperty("firstName");
		String lastName = Config.getProperty("lastName");
		String email = Config.getProperty("email");
		String pass = Config.getProperty("password");
		Thread.sleep(2000);
		
		sup.signUp(name, lastName, email, pass);

		Page.moveToElement(sup.email);
		
		
	}
	
	

		
		
		
		
		
		
		
		
		
		
		
		
//		String introTitle = "Intro | cybertek-bnb";
//		assertEquals(driver.getTitle(), introTitle, "Intro Page title verification");
//		driver.findElement(By.xpath("//a[@href='/sign-in']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Eldar+Chopa@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("EldarLovesChopa");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='button is-dark']")).click();
//	}
	
	
	

}






