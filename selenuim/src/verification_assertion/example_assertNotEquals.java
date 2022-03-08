package verification_assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example_assertNotEquals {
	
	@Test
	public void TC1() {
		
		String actResult="munna";
		String ExpectResult="sachin";
		
		Assert.assertNotEquals(actResult, ExpectResult, "both result are different");   //TC passed


//		String actResult="munna";
//		String ExpectResult="munna";
//		
//		Assert.assertNotEquals(actResult, ExpectResult, "not expecting output as munna");  //TC failed

		
	}

}
