package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.TC11_corporateGiftsUI;
import reusableComponents.BaseClass;
import reusableComponents.readExcel;

public class TC11_corporateGifts extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC11_corporateGifts.class);
	
	@Test(dataProvider = "getdata")
	public void corGifts(String Name, String Email,String Number, String enquiry) throws IOException, InterruptedException {
		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("Browser has been invoked");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("Landed on website Homepage");
		TC11_corporateGiftsUI cg = new TC11_corporateGiftsUI(driver);
		cg.Category().click();
		log.info("Clicked on Corporate Gift");
		cg.FullName().sendKeys(Name);
		log.info("Entered the name");
		cg.Email().sendKeys(Email);
		log.info("Entered the Email");
		cg.Number().sendKeys("1235");
		log.info("Entered the number");
		cg.enuiry().sendKeys(enquiry);
		log.info("Entered the enquiry text");
	}
	
	@DataProvider
	//data is being recieved from readExcel.java
	public Object[][] getdata() throws IOException{
		Object[][] data0 = readExcel.getDetails("login");
		return data0;
	}
	
}