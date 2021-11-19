package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.TC7_QuantityUI;
import reusableComponents.BaseClass;
public class TC7_Quantity extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC7_Quantity.class);
	
	@Test
	public void ChristmasGift() throws IOException, InterruptedException {

		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("TestCase 7");
		log.info("Browser has been invoked");
		driver.get(prop.getProperty("webSiteURL"));
		log.info("landed on Website Homepage");
		driver.manage().window().maximize();
		TC7_QuantityUI quant = new TC7_QuantityUI(driver);
		quant.category().click();
		log.info("New Category");
		quant.Item().get(2).click();
		log.info("Clicked on the item");
//		Thread.sleep(5000);
		quant.Quantity().click();
		log.info("increased the quantity to 2");
	}
}
