package action_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example_doubleclick {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement clickme = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(clickme).perform();
		
		act.doubleClick().perform();
		
		//act.doubleClick(clickme).perform();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		String text = alt.getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
	
		alt.accept();
		
		

}
}