package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute {

		public static void main(String[] args) throws InterruptedException {
			
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			d.get("https://www.facebook.com/");
			
			Thread.sleep(3000);  
			
			//d.findElement(locator)
			
			//d.findElement(By.xpath(xpathExpression))
			
			//enter UN
			
			d.findElement(By.xpath("//input[@id='email']")).sendKeys("munnamendhe");
			
			//enter PSWD
			
			d.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcdefghijk");
			
			//click login button
			
			d.findElement(By.xpath("//button[@name='login']")).click();
			
	}

}
