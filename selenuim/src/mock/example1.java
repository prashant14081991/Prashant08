package mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class example1 {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver(options);
		
		d.get("https://en-gb.facebook.com/");
		
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(3000);  
		
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("munna mendhe");
		
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("Stfumcbc@15264859");
		
		d.findElement(By.xpath("//button[@name='login']")).click();
		
		d.manage().window().maximize();

		d.findElement(By.xpath("//input[@type='search']")).sendKeys("ruturaj rodage");
		
		
		
		d.findElement(By.xpath("//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5']")).click();
	
		
		WebElement ruturaj = d.findElement(By.xpath("//span[text()='Ruturaj Rodage (Rudra )']"));
		
		Actions act=new Actions(d);
		
		act.moveToElement(ruturaj).perform();
}
}