package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selct_radio_button {
	

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe\\");
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://en-gb.facebook.com/");
					
					driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
					
					Thread.sleep(2000);
					
					WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
					
					boolean m = male.isSelected();
					
					if (m==true)
					{
						System.out.println("male button is selected");
					} 
					else {
						System.out.println("male button  not selected");
						
					}
					male.click();
					boolean m2 = male.isSelected();
					
					if (m2==true)
					{
						System.out.println("male button is selected");
					} 
					else {
						System.out.println("male button  not selected");
						
					}
					
	}

}
