package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstTesting {
    WebDriver driver;
	
	@BeforeClass           //Very first one time
	public void beforeClass() {
		System.out.println("Very before Class");
	}
	
	@AfterClass            //After all one time
	public void afterClass() {
		System.out.println("All after class");
	}
	
	
	@BeforeMethod     
	public void beforeMethod() {
		System.out.println("This is before method annotation");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("This is after method");
	}
	@Test
	public void test1() {
		String name = "James";
		
		System.out.println("This is test 1");
		//Assert.assertTrue(name.equals("james"),"Name verification");
        Assert.assertFalse(name.equals("james"),"Asert false assertions");
		
	}
	
	@Test
	public void test2() {
		System.out.println("This is test 2");
		String titleExpected = "Google";
		String titleFrom = "Google";
		
		String resultAnswer = "Google title verification fail: ";
		Assert.assertEquals(titleFrom,titleExpected, resultAnswer );
	}
	
	
	
	
	
	

}





