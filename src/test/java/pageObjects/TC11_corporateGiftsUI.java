package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC11_corporateGiftsUI {
	
	WebDriver driver;

	public TC11_corporateGiftsUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Corporate Gifts")
	WebElement Category;
	
	@FindBy(id = "contactFormName")
	WebElement FullName;
	
	@FindBy(id = "contactFormEmail")
	WebElement Email;
	
	@FindBy(id = "contactFormPhone")
	WebElement Number;
	
	@FindBy(id = "contactFormMessage")
	WebElement Enquiry;
	
	@FindBy(className = "btn")
	WebElement Submit;
	
	public WebElement Category() {
		return Category;
	}
	public WebElement FullName() {
		return FullName;
	}
	public WebElement Email() {
		return Email;
	}
	public WebElement Number() {
		return Number;
	}
	public WebElement enuiry() {
		return Enquiry;
	}
	public WebElement Submit() {
		return Submit;
	}
}
