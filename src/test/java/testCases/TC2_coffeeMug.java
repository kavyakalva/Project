package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import pageObjects.TC2_coffeeMugUI;
import reusableComponents.BaseClass;

public class TC2_coffeeMug extends BaseClass{
	private static Logger log = Logger.getLogger(TC2_coffeeMug.class);
	@Test
	public void coffee() throws IOException {
		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("TestCase 2");
		log.info("Browser has been invoked");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("Landed on Website home page");
		TC2_coffeeMugUI cm = new TC2_coffeeMugUI(driver);
		cm.SearchTab().sendKeys("coffee Mug");
		log.info("Entered coffee mugs iin search bar");
		cm.SearchTab().sendKeys(Keys.ENTER);
		log.info("clicked on enter");
		cm.searchMug().get(2).click();
		log.info("Clicked on the coffee mug item");
		cm.AddToCart().click();
		log.info("Added Coffee mug to the cart");
	}
	
}
