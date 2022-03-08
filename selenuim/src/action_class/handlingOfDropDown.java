package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingOfDropDown 
{
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement loginbutton = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(loginbutton).perform();
		
		//act.click(loginbutton).perform();   //direct click on target
		
		
		Thread.sleep(2000);
		
		act.contextClick().perform();  //right click
		
		//act.click().perform();    //left click
		
		//act.moveToElement(loginbutton).contextClick().build().perform();
		
		//driver.findElement(By.xpath("//div[text()='My Profile']")).click();
		
		
		
}
}