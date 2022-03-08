package frameworks_POM_with_DDF;

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

public class kite_testClass
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\munna1.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	kitelogin1page login1=new kitelogin1page(driver);
	String un = sh.getRow(1).getCell(0).getStringCellValue();
	login1.inpKiteLogin1pagUsername(un);
	
	String pswd = sh.getRow(1).getCell(1).getStringCellValue();
	login1.inpKiteLogin1pagPassword(pswd);
	
	login1.clickKiteLogin1pageLoginBtn();
	
	kiteLogin2Page login2=new kiteLogin2Page(driver);
	String pin = sh.getRow(1).getCell(2).getStringCellValue();
	login2.inpKiteLogin2pagePIN(pin);
	
	login2.clickKitelogin2pageContBtn();
	
	kiteHomePage homepg=new kiteHomePage(driver);
	String expectID = sh.getRow(1).getCell(3).getStringCellValue();
	homepg.verifyKitehomepageuserID(expectID);
		
}	
}