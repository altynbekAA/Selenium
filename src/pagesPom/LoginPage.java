package pagesPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="passwd")
	public WebElement password;
	
	//@FindBy(id="SubmitLogin")
	public WebElement SubmitLogin;  //it will search the element by ID=SubmitLogin or name=SubmitLogin
	
	@FindBy(xpath="//h3[.='Create an account']")
	public WebElement createACcountlabel;
	
	@FindBy(xpath="@FindBy(xpath=\"\")")
	public WebElement alreadyRegisteredLabel;  	
	
	public boolean isAt() {
		return driver.getTitle().equals("Login");
	}
	
	public void login(String lEmail, String lPassword) {
		email.sendKeys(lEmail);
		password.sendKeys(lPassword);
		SubmitLogin.click();
	}
	
	
	
}










