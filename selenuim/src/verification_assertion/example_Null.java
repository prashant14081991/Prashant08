package verification_assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example_Null {
	
	@Test
	public void TC1() {
		
		String ActuResult=null;
		Assert.assertNull(ActuResult);   
	}

}
