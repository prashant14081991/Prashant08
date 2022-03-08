package selenuim;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(2000);
		
		Dimension d=new Dimension(500,800);
				
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		Point p=new Point(600,800);
		
		driver.manage().window().setPosition(p);
		
		
		
		
}
}
