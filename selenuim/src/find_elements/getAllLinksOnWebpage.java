package find_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllLinksOnWebpage {
	
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		List<WebElement> allLinks = d.findElements(By.xpath("//a"));
		
		int NUmbOfLinks = allLinks.size();
		
		System.out.println(NUmbOfLinks);
		
		for(WebElement SingleLInk :allLinks) {
			
			String text = SingleLInk.getText();
			
			System.out.println(text);
		}
		

}
}