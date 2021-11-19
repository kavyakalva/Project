package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC8_AddGiftCardUI {
	
	WebDriver driver;

	public TC8_AddGiftCardUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "gift card")
	WebElement giftCard;
	
	@FindBy(name = "add")
	WebElement addCart;
	
	@FindBy(xpath = "//*[@id='ProductSelect-738195636312-option-0']/div[5]/label")
	WebElement Amount;
	
	public WebElement GiftCard() {
		return giftCard;
	}
	
	public WebElement Amount() {
		return Amount;
	}
	public WebElement addToCart() {
		return addCart;
	}
	
	
}
