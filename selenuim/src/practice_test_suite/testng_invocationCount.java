package practice_test_suite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng_invocationCount {
	
	@Test(invocationCount = 6)
	public void TC1() {
		
		Reporter.log("running test case1",true);
		
	}
	
	@Test(invocationCount = 4)
	public void TC2() {
		
		Reporter.log("running test case2",true);
		
	}

}
