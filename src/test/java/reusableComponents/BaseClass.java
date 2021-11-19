package reusableComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	
public static WebDriver driver;

	public WebDriver initialize() throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\Question1\\Configuration\\config.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverPath"));
		driver = new ChromeDriver(options);
		return driver;
	}
	
	public void getScreenshot(String result) throws IOException
	{
		System.out.println(driver);
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("C://Users//NITIN//eclipse-workspace//Question1//Screenshots//"+result+"screenshot.png"));
	}
	
}










