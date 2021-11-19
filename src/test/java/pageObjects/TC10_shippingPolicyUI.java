package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC10_shippingPolicyUI {
	WebDriver driver;

	public TC10_shippingPolicyUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Shipping & Delivery Policy")
	WebElement shipping;
	
	@FindBy(xpath = "//*[@id=\'MainContent\']/div/div[1]/div/header/h1")
	WebElement heading;
	
	public WebElement shipping(){
		return shipping;
	}
	public WebElement Heading() {
		return heading;
	}
}
