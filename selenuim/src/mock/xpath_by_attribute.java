package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver mdm=new ChromeDriver();
	
		mdm.get("https://www.instagram.com/");
	
		Thread.sleep(2000);
	
		mdm.get("https://en-gb.facebook.com/");
	
		Thread.sleep(2000);
	
		mdm.findElement(By.xpath("//input[@type='text']")).sendKeys("munnamendhe");
			
		Thread.sleep(2000);
			
		mdm.navigate().back();
			
		Thread.sleep(2000);
			
		mdm.quit();
	
	
	
	}

}
