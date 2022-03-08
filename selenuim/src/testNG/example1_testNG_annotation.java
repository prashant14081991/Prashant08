package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example1_testNG_annotation {
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open browser", true);
		
	}
	@BeforeMethod
	public void logintoApp()
	{
		Reporter.log("login from application",true);
	}
	
	@Test(invocationCount = 3, priority = 2)
	public void verifyPIN ()
	{
		Reporter.log("running verifyPIN TC",true);
	}
	
	@Test(invocationCount = 2, priority = 1)
	public void verifyUserID()
	{
		Reporter.log("running verifyUserID TC",true);
		
	}
	@Test
	public void verifyPSWD() {
		
		Reporter.log("running verifyPSWD",true);
	}
	
	@AfterMethod
	public void logputfromApp()
	{
		Reporter.log("logout from application",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		
		Reporter.log("close browser",true);
	}

}
