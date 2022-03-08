package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindowHandle {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://skpatro.github.io/demo/links/");
		
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//input[@value='New Window']")).click();
		
		Set<String> multIds = d.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(multIds);
		
		String childWindId = al.get(1);
		
		d.switchTo().window(childWindId);
		
		d.manage().window().maximize();

}
}