package test_Cricbuzz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_cricbuzz {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jabar\\OneDrive\\Desktop\\Prashant\\java\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.cricbuzz.com/");
	Thread.sleep(5000);
	
	
//	WebElement livescore = driver.findElement(By.xpath("(//a[@class='cb-hm-mnu-itm'])[1]"));
//	livescore.click();
//	Thread.sleep(5000);
	
	WebElement Matches = driver.findElement(By.xpath("//a[@id='live-scores-link']"));
	Matches.click();
	Thread.sleep(5000); 
	
	
	}
	
}


