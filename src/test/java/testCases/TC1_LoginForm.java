package testCases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.*;

import pageObjects.logInUI1;
import reusableComponents.BaseClass;
import reusableComponents.readExcel;

public class TC1_LoginForm extends BaseClass{
	
	private static Logger log = Logger.getLogger(TC1_LoginForm.class);
	
	@Test(dataProvider = "getdata")
	//login testcase
	public void LoginPage(String email, String pass) throws IOException {
		driver = initialize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		log.info("TestCase 1");
		log.info("browser has been invoked");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("webSiteURL"));
		log.info("Landed on website url");
		logInUI1 lg = new logInUI1(driver);
		lg.logInBtn().click();
		log.info("Click on log in button");
		lg.EnterEmail().sendKeys(email);
		lg.EnterPass().sendKeys(pass);
		log.info("Entered the values");
		lg.submitEP().click();
		log.info("Clicked on submit");
		driver.quit();
	}
	

	
	@DataProvider
	//data is being recieved from readExcel.java
	public Object[][] getdata() throws IOException{
		Object[][] data0 = readExcel.getDetails("login");
		return data0;
	}
	
	
	//to close the window after the test execution
	@AfterTest
	public void close() {
		driver.quit();
	}
}
