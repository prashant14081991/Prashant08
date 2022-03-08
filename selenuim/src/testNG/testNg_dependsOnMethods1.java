package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNg_dependsOnMethods1 {
	
	
	
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
	
	@Test(dependsOnMethods = {"verifyPIN","verifyUserID"})
	public void logputfromApp()
	{
		Reporter.log("logout from application",true);
	}
	

}

