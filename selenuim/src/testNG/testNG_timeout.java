package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG_timeout {
	
	@Test(timeOut = 5000)
	public void TC1() throws InterruptedException 
	{
		Thread.sleep(7000);
		Reporter.log("running test case1",true);
		
	}
	
	@Test()
	public void TC2() {
		
		Reporter.log("running test case2",true);
		
	}

}
