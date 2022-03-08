package frameworks_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage {
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement ProfileID;
	
	
	public kiteHomePage (WebDriver drivervalue){
		
		PageFactory.initElements(drivervalue, this);
	}
	
	public void verifyProfileID() 
	{
		String actualID = ProfileID.getText();
		String expectedID = "DV1510";
		
		if (actualID.equals(expectedID))
		{
			System.out.println("test case pass");
			
		}
		else {
			System.out.println("test case failed");
		}
		
	}
}
