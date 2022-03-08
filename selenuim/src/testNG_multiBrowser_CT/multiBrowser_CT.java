package testNG_multiBrowser_CT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class multiBrowser_CT {
	@Parameters("browserName")
	@Test
	public void TC(String browserName) throws InterruptedException 
	{
		WebDriver driver=null;
		if (browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe\\");
			
		    driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\geckodriver-v0.29.1-win64\\geckodriver.exe\\");
			
			driver=new FirefoxDriver();	
		}
		else if (browserName.equals("IE"))
		{

			System.setProperty("webdriver.ie.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe\\");
			
			driver=new InternetExplorerDriver();	
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		//driver.manage().window().maximize();

				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Year@123");
				driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
				driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
				driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
				String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
				String expUserID = "DV1510";

				if (actUserID.equals(expUserID)) {
					System.out.println("TC Pass");
				} else {
					System.out.println("TC Failed");
				}

				driver.close();
	}

}
