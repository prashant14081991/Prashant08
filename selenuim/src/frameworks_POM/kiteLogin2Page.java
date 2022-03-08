package frameworks_POM;

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

public void enterPIN() {
	
	pin.sendKeys("959594");
}

public void clickContBtn() {
	
	ContBtn.click();
}
}
