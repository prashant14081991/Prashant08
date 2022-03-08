package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllDataInWebTable_dynamicTable 
{
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Program%20Files/eclipse-dsl-2020-06-R-win32-x86_64/eclipse/webtable.html");
		
		int rowsize = driver.findElements(By.xpath("//table[@class='abc']/tbody/tr")).size();
		
		
		for (int i = 1; i <=rowsize; i++) 
		{
			int colsize;
			if (i==1) 
			{
			 colsize = driver.findElements(By.xpath("//table[@class='abc']/tbody/tr[" +i+ "]/th")).size();
			}
			else 
			{
			 colsize = driver.findElements(By.xpath("//table[@class='abc']/tbody/tr[" +i+ "]/td")).size();
			}
			
			
			for (int j = 1; j <= colsize; j++) 
			{
				if (i==1) 
				{
					String text = driver.findElement(By.xpath("//table[@class='abc']/tbody/tr[" +i+ "]/th[" +j+ "]")).getText();
					System.out.print(text+"  ");
				}
				else {
					String text = driver.findElement(By.xpath("//table[@class='abc']/tbody/tr[" +i+ "]/td[" +j+ "]")).getText();
					System.out.print(text+"  ");
				}
			}
			System.out.println();
		}
		

}
}