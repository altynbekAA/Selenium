package mondayProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OlympicsMedals {

	WebDriver driver;
	private ArrayList<Integer> rankAcending;

	@BeforeClass
	public void setup() {
		String driverPath = "/Users/altynbekabdurasulov/selenium depen/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}

	@Test(priority = 1)
	public void veifyRankIsInAscendingOrder() throws InterruptedException {
		driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics");

		List<WebElement> elements = driver
				.findElements(By.xpath("//caption[.='2016 Summer Olympics medal table']/..//tbody//td[1]"));

		ArrayList<Integer> actualRank = new ArrayList<>();

		for (int i = 0; i < elements.size(); i++) {
			if (i == 10)
				break;
			int num = Integer.parseInt(elements.get(i).getText());
			actualRank.add(num);

		}

		rankAcending = new ArrayList<>(actualRank);
		Collections.sort(rankAcending);

		Assert.assertEquals(rankAcending, actualRank);

	}

	@Test(priority = 2)
	public void verifyTableIsInAlphabeticalOrder() {
		driver.findElement(By.xpath("//th[.='NOC']")).click();

		List<WebElement> countryElem = driver
				.findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//a"));

		ArrayList<String> actualCountries = new ArrayList<>();
		for (WebElement elem : countryElem) {
			actualCountries.add(elem.getText());
		}

		ArrayList<String> expectedCountries = new ArrayList<>(actualCountries);

		Assert.assertEquals(expectedCountries, actualCountries);

	}

}
