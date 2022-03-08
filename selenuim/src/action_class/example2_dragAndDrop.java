package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2_dragAndDrop {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		//act.dragAndDrop(source, dest).perform();
		
		act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();

}
}