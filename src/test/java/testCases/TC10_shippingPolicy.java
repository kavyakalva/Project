package testCases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.TC10_shippingPolicyUI;
import reusableComponents.BaseClass;

public class TC10_shippingPolicy extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC10_shippingPolicy.class);

	@Test
	public void coffee() throws IOException {
		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("Test case 10");
		log.info("browser has been invoked");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("landed on website HomePage");
		TC10_shippingPolicyUI ship = new TC10_shippingPolicyUI(driver);
		ship.shipping().click();
		log.info("Clicked on the Shipping & deliver Policy link");
		String text = ship.Heading().getText();
		log.info("Got the heading");
		try{
			Assert.assertEquals(text, "Shipping & Delivery Policy");
		}catch(AssertionError e){
			System.out.println("not equal");
			throw e;
		}
		log.info("Heading checking done");;
		System.out.println("Equal");
	}
}
