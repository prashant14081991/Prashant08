package frameworks_POM_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test_class1 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\munna1.xlsx");
			
			Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Apr21B_Selenium_Soft\\chromedriver_win32 (9)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			kitelogin1page login1=new kitelogin1page(driver);
			
			login1.inpKiteLogin1pagUsername(sh.getRow(0).getCell(0).getStringCellValue());
			
			login1.inpKiteLogin1pagPassword(sh.getRow(0).getCell(1).getStringCellValue());
			
			login1.clickKiteLogin1pageLoginBtn();
			
			
			kiteLogin2Page login2=new kiteLogin2Page(driver);
			
			login2.inpKiteLogin2pagePIN(sh.getRow(0).getCell(2).getStringCellValue());
			
			login2.clickKitelogin2pageContBtn();
			
			
			kiteHomePage homepg=new kiteHomePage(driver);
		
			homepg.verifyKitehomepageuserID(sh.getRow(0).getCell(3).getStringCellValue());
				
		}	

}
