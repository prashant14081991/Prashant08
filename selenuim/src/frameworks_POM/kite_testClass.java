package frameworks_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class kite_testClass
{
public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	kitelogin1page login1=new kitelogin1page(driver);
	login1.enterUN();
	login1.enterPswd();
	login1.clickOnLoginBtn();
	
	kiteLogin2Page login2=new kiteLogin2Page(driver);
	login2.enterPIN();
	login2.clickContBtn();
	
	kiteHomePage homepg=new kiteHomePage(driver);
	homepg.verifyProfileID();
	
		
		
}
}