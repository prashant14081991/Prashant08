package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class options_ascending_order {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe\\");
				
				WebDriver driver=new ChromeDriver();
				
				
				
				driver.get("https://en-gb.facebook.com/");
				
				driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
				
				Thread.sleep(2000);
				
				TreeSet<String> tr=new TreeSet<String>();
				
				WebElement mdm = driver.findElement(By.xpath("//select[@name='birthday_month']"));
				
				Select month=new Select(mdm);
			
				List<WebElement> s = month.getOptions();
				
				for(WebElement single:s) {
				
					String text = single.getText();
					
					tr.add(text);
				}
				
				for(String sd:tr) {
					
					System.out.println(sd);
				}
				
}
}