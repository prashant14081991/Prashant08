package verification_assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1_assertEquals {
	
	@Test
	public void TC1() {
		
//		String actResult="munna";
//		String ExpectResult="sachin";
//		
//		Assert.assertEquals(actResult, ExpectResult, "expected result is sachin:");


		String actResult="munna";
		String ExpectResult="munna";
		
		Assert.assertEquals(actResult, ExpectResult, "expected result is munna:");

		
	}

}
