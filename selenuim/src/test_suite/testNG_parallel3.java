package test_suite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG_parallel3 {

	
@Test
public void TC1() throws InterruptedException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
}
}