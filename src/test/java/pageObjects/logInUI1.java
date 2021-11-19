package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInUI1 {
	
	WebDriver driver;

	public logInUI1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "sign in")
	WebElement logInButton;
	
	@FindBy(css = "input[id*='CustomerEmail']")
	WebElement enterEmail;
	
	@FindBy(css = "input[id*='CustomerPassword']")
	WebElement enterPass;
	
	@FindBy(css = "input[value*='Sign In']")
	WebElement submit;
	
	
	public WebElement logInBtn() {
		return logInButton;
	}
	public WebElement EnterEmail() {
		return enterEmail;
	}
	public WebElement EnterPass() {
		return enterPass;
	}
	public WebElement submitEP() {
		return submit;
	}
	
}
