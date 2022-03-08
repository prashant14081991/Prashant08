package verification_assertion;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example_assertTrue {
	
	@Test
	public void TC1() {
		
//		boolean actREsult = true;
//		
//		Assert.assertTrue(actREsult);
		
		boolean actResult=false;
		
		Assert.assertTrue(actResult, "expected result is true");
	}

	

}