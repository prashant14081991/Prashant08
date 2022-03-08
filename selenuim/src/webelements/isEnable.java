package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		boolean mdm=driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled();
		
		System.out.println(mdm);
		
		if (mdm== true)
		{
			System.out.println("log in button is enable");	
		}
		else 
		{
			System.out.println("log is button is disable");
		}
		
}
}
