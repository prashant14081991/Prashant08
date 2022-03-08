package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		//boolean  img=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		 
		 //System.out.println(img);
		
		boolean result;
		
		try {
			 result=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img1']")).isDisplayed();  //risky code
			
		} 
		catch (NoSuchElementException e)
		{
			result=false;
		}
		System.out.println(result);
		
		if (result==true)
		{
			System.out.println("logo is displayed");
		} 
		else 
		{
			System.out.println("logo is not displayed");
		}
		
		}

}
