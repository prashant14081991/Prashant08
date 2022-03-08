package frameworks_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin1page {
	//veriable declaration
@FindBy(xpath="//input[@id='userid']") private WebElement UN;
@FindBy(xpath="//input[@id='password']")private WebElement Psw;
@FindBy(xpath="//button[@class='button-orange wide']")private WebElement loginBtn;

//declaration
public kitelogin1page(WebDriver drivervalue)
{
	PageFactory.initElements(drivervalue, this);
	
}

//usage
public void enterUN() {
	
	UN.sendKeys("DV1510");
}
public void enterPswd() {
	
	Psw.sendKeys("Year@123");	
}
public void clickOnLoginBtn() {
	
	loginBtn.click();
}

}
