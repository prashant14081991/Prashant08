package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_index {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\eclipse-dsl-2020-06-R-win32-x86_64\\\\eclipse\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("munna");
		
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]")).sendKeys("mendhe");
	}

}
