package auto_suggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_auto {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String expectedResult="xiaomi mi 11 ultra";
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("xiaomi");
		
		Thread.sleep(2000);
		
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		
		for(WebElement singleoption:allOptions) 
		{
			String actualresult = singleoption.getText();
			System.out.println(actualresult);
			
			if (actualresult.equals(expectedResult)) 
			{
				singleoption.click();
				break;
			}
		}

}
}