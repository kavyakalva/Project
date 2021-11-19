package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC5_pinCodeUI {

	WebDriver driver;

	public TC5_pinCodeUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Top 50")
	WebElement Category;
	
	@FindBy(xpath = "//*[@id='CollectionAjaxContent']/div[1]/div[2]/div/a/div[2]/div")
	List <WebElement> Item;
	
	@FindBy(id = "PostalCode")
	WebElement pinCode;
	
	@FindBy(xpath = "//*[@id='cod-cheker']/button")
	WebElement Check;
	
	public WebElement category() {
		return Category;
	}
	
	public List<WebElement> Item() {
		return Item;
	}
	public WebElement pinCode() {
		return pinCode;
	}

	public WebElement Check() {
		return Check;
	}
}
