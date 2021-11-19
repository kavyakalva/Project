package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC2_coffeeMugUI {

	WebDriver driver;

	public TC2_coffeeMugUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	WebElement searchTab;
	
	@FindBy(xpath = "//main[@class = 'main-content']/div/div/div/div/div/div[3]/div/ul/li")
	List <WebElement> Mug;
	
	
	@FindBy(xpath = "//*[@name='add']")
	WebElement addToCart;
	
	public WebElement SearchTab() {
		return searchTab;
	}
	
	public List<WebElement> searchMug() {
		return Mug;
	}
	
	public WebElement AddToCart() {
		return addToCart;
	}
}


