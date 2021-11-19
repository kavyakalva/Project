package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC4_GiftNoteUI {

	WebDriver driver;

	public TC4_GiftNoteUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Christmas Gifts")
	WebElement crisGiftBtn;
	
	@FindBy(xpath = "//*[@id=\'CollectionAjaxContent\']/div[1]/div[3]/div/a/div")
	List <WebElement> giftItem;
	
	@FindBy(name = "add")
	WebElement addCart;
	
	@FindBy(xpath = "//input[@id = 'cart-notes']")
	WebElement giftNote;
	
	public WebElement chrisGift() {
		return crisGiftBtn;
	}
	public List<WebElement> GiftItem() {
		return giftItem;
	}
	public WebElement addToCart() {
		return addCart;
	}
	public WebElement GiftCard() {
		return giftNote;
	}
	
}
