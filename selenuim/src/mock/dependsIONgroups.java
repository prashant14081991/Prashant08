package mock;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsIONgroups {
	
	@Test(groups = "test")
	public void logintoApp()
	{
		Reporter.log("login from application",true);
		
	}
	
	@Test(groups = "test")
	public void verifyPIN ()
	{
		Reporter.log("running verifyPIN TC",true);
	}
	
	@Test(groups = "test")
	public void verifyUserID()
	{
		Reporter.log("running verifyUserID TC",true);
	}
	
	@Test(dependsOnGroups = "test")
	public void logputfromApp()
	{
		Reporter.log("logout from application",true);
	}
	
	
	

}
