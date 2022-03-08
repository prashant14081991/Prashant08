package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getColmSize {

		
		public static void main(String[] args) throws InterruptedException {
			
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver(); 
			
			driver.get("file:///C:/Program%20Files/eclipse-dsl-2020-06-R-win32-x86_64/eclipse/webtable.html");
			
		//List<WebElement> allcolm = driver.findElements(By.xpath("//table[@class='abc']//tr[2]/td"));

		//System.out.println(allcolm.size());
		
		//int colsize = driver.findElements(By.xpath("//table[@class='abc']//tr[2]/td")).size();
		//System.out.println(colsize);
		
			int colsizeheader = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[1]/th")).size();
			System.out.println(colsizeheader);
}
}