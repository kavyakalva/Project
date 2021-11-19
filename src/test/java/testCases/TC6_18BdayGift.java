package testCases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.TC6_18BdayGiftUI;
import reusableComponents.BaseClass;
public class TC6_18BdayGift extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC6_18BdayGift.class);
	
	@Test
	public void coffee() throws IOException {
		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("TesCase 6");
		log.info("Browser has been invoked");
		driver.get(prop.getProperty("webSiteURL"));
		log.info("Landed on Website Homepage");
		driver.manage().window().maximize();
		TC6_18BdayGiftUI bday = new TC6_18BdayGiftUI(driver);
		new Actions(driver).moveToElement(bday.mainMenu()).build().perform();
		log.info("Hovered on Birthday gifts");
		new Actions(driver).moveToElement(bday.subMenu()).click().build().perform();
		log.info("Hovered on 18th birthday gifts and clicked on it");
	}
}
