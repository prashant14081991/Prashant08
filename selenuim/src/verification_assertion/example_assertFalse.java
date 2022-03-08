package verification_assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example_assertFalse {
	
	
		
		@Test
		public void TC1() {
			
			boolean actREsult = true;
			
		Assert.assertFalse(actREsult);      ///TC failed
			
//			boolean actResult=false;
//			
//			Assert.assertFalse(actResult, "expected result is false");
		}

		
	}

