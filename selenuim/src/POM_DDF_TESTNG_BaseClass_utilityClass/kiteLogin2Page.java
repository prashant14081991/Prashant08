package POM_DDF_TESTNG_BaseClass_utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin2Page 
{
@FindBy(xpath="//input[@id='pin']")private WebElement pin;
@FindBy(xpath="//button[@class='button-orange wide']")private WebElement ContBtn;

public kiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public void inpKiteLogin2pagePIN(String PIN) {
	
	pin.sendKeys(PIN);
}

public void clickKitelogin2pageContBtn() {
	
	ContBtn.click();
}
}
