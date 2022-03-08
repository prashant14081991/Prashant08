package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG_Grouping1
{
	@Test(groups = "login")
	public void TC1() {
		
		Reporter.log("running TC1", true);
	}

	@Test(groups = "dashboard")
	public void TC2() {
		
		Reporter.log("running TC2", true);
	
	}
	
	@Test(groups = "login")
	public void TC3() {
		
		Reporter.log("running TC3", true);
	}

	@Test(groups = "login")
	public void TC4() {
		
		Reporter.log("running TC4", true);
	
	}

	@Test(groups = "dashboard")
	public void TC5() {
		
		Reporter.log("running TC5", true);
	}

	@Test(groups = "profile")
	public void TC6() {
		
		Reporter.log("running TC6", true);
	}

}
