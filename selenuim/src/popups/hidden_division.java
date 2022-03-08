package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_division {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver mdm=new ChromeDriver();
	
		mdm.get("https://www.flipkart.com/");
		
		
		Thread.sleep(2000);
		
		
		mdm.findElement( By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(1000);
		
		mdm.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(1000);
		
		mdm.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("munna mendhe");
		
		mdm.findElement(By.xpath("//input[@type='password']")).sendKeys("asdfghcbfy");
		
		mdm.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
}
}