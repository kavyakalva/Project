package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC3_giftsUI {

	WebDriver driver;

	public TC3_giftsUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\'myheader\']/div[1]/div/div/ul/li[7]/a")
	WebElement giftDD;
	
	@FindBy(linkText = "Birthday Gifts")
	WebElement subDD;
	
	public void DropDown() {
		new Actions(driver).moveToElement(giftDD).build().perform();
		new Actions(driver).moveToElement(subDD).click().build().perform();
	}	
}
