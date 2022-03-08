package POM_DDF_TESTNG_BaseClass_utilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kite_test1 {
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
	public void RefreshBrowser() throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
		@Test
		public void testScenario_enterOnlyUN () throws EncryptedDocumentException, IOException {
		
		TCID=300;	
		login1.inpKiteLogin1pagUsername(utilityClass.readPropertyFileData("UN"));
	
		login1.clickKiteLogin1pageLoginBtn();
		
		String actualResult = login1.getKiteLogin1pageErrorMsgPSWD();
		String expectResult="Password should be minimum 6 characters.";
		
		Assert.assertEquals(actualResult, expectResult);
		}
		
		@Test
		public void testScenario_enterOnlyPSWD () throws EncryptedDocumentException, IOException {
		
		TCID=400;	
		login1.inpKiteLogin1pagPassword(utilityClass.readPropertyFileData("PSWD"));
	
		login1.clickKiteLogin1pageLoginBtn();
		
		String actualResult = login1.getKitelLogin1PageErrMsgUN();
		String expectResult="User ID should be minimum 6 characters.";
		
		Assert.assertEquals(actualResult, expectResult);
		}
		
		@Test
		public void testScenario_clickOnLOginBtnONly() throws EncryptedDocumentException, IOException {
		
		TCID=500;	
		login1.clickKiteLogin1pageLoginBtn();
		
		String actualResult = login1.getKitelLogin1PageErrMsgUN();
		String expectResult="User ID should be minimum 6 characters.";
		Assert.assertEquals(actualResult, expectResult);
		
		String actualResult1 = login1.getKitelLogin1PageErrMsgUN();
		String expectResult1="User ID should be minimum 6 characters.";
		Assert.assertEquals(actualResult1, expectResult1);
		
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
}
