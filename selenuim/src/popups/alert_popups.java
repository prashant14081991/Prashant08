   package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popups {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		Thread.sleep(1000);

		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		
		System.out.println(text);
		
		alt.accept();    //ok
		
		alt.dismiss();  //cancel 
				
}
}