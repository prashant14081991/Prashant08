package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys_clear {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("munna");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		//Thread.sleep(2000);
		
		WebElement un=driver.findElement(By.xpath("//input[@type='text']"));
		
		un.sendKeys("munna");
		
//		String ste = un.getAttribute("value");
//		
//		System.out.println("entered value is:  " + ste);
//		
		Thread.sleep(2000);
		
		un.clear();
		
		un.sendKeys("sachin");
}

}
