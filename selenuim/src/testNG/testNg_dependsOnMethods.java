package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNg_dependsOnMethods {
	
	@Test
	public void logintoApp()
	{
		Reporter.log("login from application",true);
		Assert.fail();
	}
	
	@Test
	public void verifyPIN ()
	{
		Reporter.log("running verifyPIN TC",true);
	}
	
	@Test
	public void verifyUserID()
	{
		Reporter.log("running verifyUserID TC",true);
		
	}
	
	@Test(dependsOnMethods = {"logintoApp","verifyPIN","verifyUserID"})
	public void logputfromApp()
	{
		Reporter.log("logout from application",true);
	}
	

}
