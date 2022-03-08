  package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://skpatro.github.io/demo/links/");
		
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> multiIDs = d.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(multiIDs);
		
		String childId = al.get(1);
		
		d.switchTo().window(childId);
		
		d.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		

}
}