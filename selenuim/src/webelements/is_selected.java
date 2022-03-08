package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(4000);
		
		WebElement select=driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		
		boolean result=select.isSelected();
		
		if (result==true)
		{
			System.out.println("button is already selected");
		} 
		else 
		{
			System.out.println("button is not selected");
		}
		
		select.click();
		
		boolean result1=select.isSelected();
		
		if (result1==true) 
		{
			System.out.println("button is selected");
		} 
		else 
		{
			System.out.println("button is not selected");
		}
}
}