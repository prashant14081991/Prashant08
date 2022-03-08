package POM_DDF_TESTNG_BaseClass_utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class kiteHomePage {
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement ProfileID;
	
	
	public kiteHomePage (WebDriver drivervalue){
		
		PageFactory.initElements(drivervalue, this);
	}
	
	public String verifyKitehomepageuserID( ) 
	{
		String actualID = ProfileID.getText();	
	return actualID;
	}
}
