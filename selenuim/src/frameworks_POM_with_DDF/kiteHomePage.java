package frameworks_POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class kiteHomePage {
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement ProfileID;
	
	
	public kiteHomePage (WebDriver drivervalue){
		
		PageFactory.initElements(drivervalue, this);
	}
	
	public void verifyKitehomepageuserID(String expectedID ) 
	{
		String actualID = ProfileID.getText();
		
		
		if (actualID.equals(expectedID))
		{
			System.out.println("test case pass");
			
		}
		else {
			System.out.println("test case failed");
		}
		
	}
}
