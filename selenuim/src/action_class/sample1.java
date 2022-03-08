package action_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1 {
	
public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
	
WebDriver driver=new ChromeDriver();
	
driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement loginbutton = driver.findElement(By.xpath("//a[text()='Login']"));
		
		String expectedresult = "Gift Cards";
		
		Actions act=new Actions(driver);
		
		act.moveToElement(loginbutton).perform();
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='pO9syL _1s9xSv']/li"));
		
		System.out.println(	alloptions.size());
		
		for(WebElement singleoption:alloptions) {
			
			String actualresult = singleoption.getText();
			
			System.out.println(actualresult);
			
			if (actualresult.equalsIgnoreCase(expectedresult)) {
				
				singleoption.click();
				break;
				
			}
		}
		
		

}
}