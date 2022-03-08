package mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openMOZILLA {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\geckodriver-v0.29.1-win64\\geckodriver.exe\\");
		
		WebDriver driver=new FirefoxDriver();
		
	
	}

}
