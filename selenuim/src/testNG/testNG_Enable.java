package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG_Enable {
	
	@Test(enabled = false)
	public void verifyPIN ()
	{
		Reporter.log("running verifyPIN TC",true);
	}
	
	@Test(priority = 1)
	public void verifyUserID()
	{
		Reporter.log("running verifyUserID TC",true);
	}
	
	@Test
	public void logputfromApp()
	{
		Reporter.log("logout from application",true);
	}


}
