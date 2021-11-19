package testCases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pageObjects.TC9_wishListUI;
import reusableComponents.BaseClass;

public class TC9_wishList extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC9_wishList.class);
	
	@Test
	public void TC9_wishList() throws IOException{
		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("test case 9");
		log.info("Browser invoking done");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("landed on Website Homepage");
		TC9_wishListUI wish = new TC9_wishListUI(driver);
		wish.Category().click();
		log.info("landed on All of It page");
		wish.Item().get(0).click();
		log.info("Selected the item");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wish.addToWhish().click();
		log.info("added to wish list");
	}
}
