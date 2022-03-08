package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_allselected {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe\\");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("file:///C:/Program%20Files/eclipse-dsl-2020-06-R-win32-x86_64/eclipse/contry.html");
				
				WebElement mdm = driver.findElement(By.xpath("//select[@multiple='true']"));
				
				Select s=new Select(mdm);
				
				s.selectByVisibleText("ind");
				s.selectByVisibleText("aus");
				s.selectByVisibleText("eng");
				
				List<WebElement> selected = s.getAllSelectedOptions();
				
				for(WebElement single:selected) {
					
					String text = single.getText();
					System.out.println(text);
				}
}

}
