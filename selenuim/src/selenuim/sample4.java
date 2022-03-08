package selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		String actualtitle=driver.getTitle();
		
		String expectedtitle="google";
		
		if (actualtitle.equals(expectedtitle)) 
		{
			
			System.out.println("pass");	
		}
		else 
		{
			System.out.println("fail");
		}

}
}
