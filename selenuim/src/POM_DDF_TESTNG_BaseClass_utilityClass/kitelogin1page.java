package POM_DDF_TESTNG_BaseClass_utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin1page {
	//veriable declaration
@FindBy(xpath="//input[@id='userid']") private WebElement UN;
@FindBy(xpath="//input[@id='password']")private WebElement Psw;
@FindBy(xpath="//button[@class='button-orange wide']")private WebElement loginBtn;
@FindBy(xpath="//span[contains(text(),\"Password should\")]") WebElement errMsgPswd;
@FindBy(xpath="//span[contains(text(),\"User ID should\")]") WebElement errMsgUN;
//declaration
public kitelogin1page(WebDriver drivervalue)
{
	PageFactory.initElements(drivervalue, this);
}

//usage
public void inpKiteLogin1pagUsername(String username) {
	
	UN.sendKeys(username);
}
public void inpKiteLogin1pagPassword(String password) {
	
	Psw.sendKeys(password);	
}
public void clickKiteLogin1pageLoginBtn() {
	
	loginBtn.click();
}
public String getKiteLogin1pageErrorMsgPSWD() {
	
	String actualText = errMsgPswd.getText();
	return actualText;
}

public String getKitelLogin1PageErrMsgUN() {
	
	String actualText = errMsgUN.getText();
	return actualText;
}

}
