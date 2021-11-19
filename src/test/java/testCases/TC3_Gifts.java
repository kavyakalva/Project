package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.TC3_giftsUI;
import reusableComponents.BaseClass;

public class TC3_Gifts  extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC3_Gifts.class);
	
	@Test
	public void coffee() throws IOException {

		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("TestCase 3");
		log.info("Browser has been invoked");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("landed on HomePage");
		TC3_giftsUI gift = new TC3_giftsUI(driver);
		log.info("howered on gifts and clicked on Birthday Gifts");
		gift.DropDown();
}
}
