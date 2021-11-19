package testCases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.TC4_GiftNoteUI;
import reusableComponents.BaseClass;
public class TC4_GiftNote extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC4_GiftNote.class);	
	@Test
	public void GiftNote() throws IOException, InterruptedException {

		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("TestCase 4");
		log.info("browser has been invoked");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("Landed on Webstie Homepage");
		TC4_GiftNoteUI Cgift = new TC4_GiftNoteUI(driver);
		Cgift.chrisGift().click();
		log.info("clicked on Christmas gifts");
		Cgift.GiftItem().get(1).click();
		log.info("Selected the required item");
		Cgift.addToCart().click();
		log.info("Added the Item to the cart");
		Thread.sleep(5000);
		Cgift.GiftCard().click();
		log.info("Added a gift note to it");
	}	
}
