package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC7_QuantityUI {

	WebDriver driver;

	public TC7_QuantityUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "New")
	WebElement Category;
	
	@FindBy(xpath = "//*[@id=\'CollectionAjaxContent\']/div[1]/div[3]/div/a/div[2]/div")
	List <WebElement> Item;
	
	@FindBy(xpath = "//*[@id='AddToCartForm-6954163503302']/div[2]/div/span[1]")
	WebElement AddQuant;
	
	public WebElement category() {
		return Category;
	}
	public List<WebElement> Item() {
		return Item;
	}
	public WebElement Quantity() {
		return AddQuant;
	}
}
