package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contains 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://en-gb.facebook.com/");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[contains(@class,'_55r1')]")).sendKeys("munnamendhe");
		
		d.findElement(By.xpath("//input[contains(@class,'_9npi')]")).sendKeys("ctatvssbk");
		
		
		d.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
	}
	

}
