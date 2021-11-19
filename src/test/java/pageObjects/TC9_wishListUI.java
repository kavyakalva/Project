package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC9_wishListUI {
	WebDriver driver;

	public TC9_wishListUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "All of it")
	WebElement category;
	
	@FindBy(xpath = "//*[@id='CollectionAjaxContent']/div[1]/div[8]/div/a/div[2]/div")
	List <WebElement> Item;
	
	@FindBy(xpath = "//*[@id='ProductSection-7060173357254']/div/div/div[1]/div[2]/div/div[1]/div[1]/div/button")
	WebElement AddToWish;
	
	public WebElement Category() {
		return category;
	}
	public List<WebElement> Item() {
		return Item;
	}
	public WebElement addToWhish() {
		return AddToWish;
	}
}
