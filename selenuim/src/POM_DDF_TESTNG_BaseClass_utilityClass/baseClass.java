package POM_DDF_TESTNG_BaseClass_utilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseClass {
	
	WebDriver driver;
	
	public void InitializeBrowser() throws EncryptedDocumentException, IOException {
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\chromedriver.exe\\");
		driver = new ChromeDriver(options);
		//driver.get("https://kite.zerodha.com/");
		driver.get(utilityClass.readPropertyFileData("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
