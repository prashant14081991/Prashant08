package framework_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_DDF 
{
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//enter user ID
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Year@123");
		
		//click on login button
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		
		//click on continue btn
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		//verify user ID
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expUserID = "DV1510";
		
		if(actUserID.equals(expUserID))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Failed");
		}
		
		
	}

}
