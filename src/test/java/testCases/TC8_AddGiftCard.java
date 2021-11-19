package testCases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.TC8_AddGiftCardUI;
import reusableComponents.BaseClass;
public class TC8_AddGiftCard extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC8_AddGiftCard.class);

	@Test
	public void AddGiftCard() throws IOException {
		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("Test case 8");
		log.info("browser has been invoked");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("landed on wesite homepage");
		TC8_AddGiftCardUI addCard= new TC8_AddGiftCardUI(driver);
		addCard.GiftCard().click();
		log.info("clicked on gift card");
		addCard.Amount().click();
		log.info("selected the amount");
		addCard.addToCart().click();
		log.info("added the gift card to the cart");
	}
}
