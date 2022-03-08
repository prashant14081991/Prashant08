package verification_assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example_assertNull {

	@Test
	public void TC1() {
		
		String ActuResult="munna";
		Assert.assertNotNull(ActuResult);   
	}
}
