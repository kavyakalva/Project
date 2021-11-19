package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.TC5_pinCodeUI;
import reusableComponents.BaseClass;

public class TC5_pincode extends BaseClass{

	private static Logger log = Logger.getLogger(TC5_pincode.class);
	
	@Test
	public void ChristmasGift() throws IOException {

		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("Test Case 5");
		log.info("Browser has been invoked");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("Landed on Website homepage");
		TC5_pinCodeUI pin = new TC5_pinCodeUI(driver);
		pin.category().click();
		log.info("clicked on Top 50 Category");
		pin.Item().get(0).click();
		log.info("Selected the Item");
		pin.pinCode().sendKeys("123456");
		log.info("Entered the pincode");
		pin.Check().click();
		log.info("Clicked on check");
	}
}
