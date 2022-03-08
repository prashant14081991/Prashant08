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
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kite_testClass extends baseClass
{   
	int TCID;
	kitelogin1page login1;
	kiteLogin2Page login2;
	kiteHomePage homepg;
	
@BeforeClass	
	public void openBRowser() throws EncryptedDocumentException, IOException {
	
	
	InitializeBrowser();
	 login1=new kitelogin1page(driver);
	 login2=new kiteLogin2Page(driver);
	 homepg=new kiteHomePage(driver);
	 
}
	@BeforeMethod
	public void LoginToApplication() throws EncryptedDocumentException, IOException {
	
	TCID=200;	
	login1.inpKiteLogin1pagUsername(utilityClass.readPropertyFileData("UN"));
	login1.inpKiteLogin1pagPassword(utilityClass.readPropertyFileData("PSWD"));
	login1.clickKiteLogin1pageLoginBtn();
	
	login2.inpKiteLogin2pagePIN(utilityClass.readPropertyFileData("PIN"));
	login2.clickKitelogin2pageContBtn();
	
	}
	
	@Test
	public void VerifyUserID() throws EncryptedDocumentException, IOException {
		
	String expectedId = utilityClass.testData(1, 3);
	String actualID = homepg.verifyKitehomepageuserID();
	
	Assert.assertEquals(actualID, expectedId);
	}	
	
	@AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException {
		
		if (result.getStatus()==ITestResult.FAILURE) {
			
			utilityClass.screenshots(driver, TCID);
		}
		
		Reporter.log("logout from application",true);
	}
	
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("close browser", true);
		
	}
}