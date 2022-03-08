package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdatafromtable {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Program%20Files/eclipse-dsl-2020-06-R-win32-x86_64/eclipse/webtable.html");
		
		//String text = driver.findElement(By.xpath("//table[@class='abc']//tr[2]/td[2]")).getText();
	
		//System.out.println(text);

		String text = driver.findElement(By.xpath("//table[@class='abc']//tr[1]/th[2]")).getText();
		
		System.out.println(text);
}
}