package mock;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class openIExplorer {
public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe\\");
		
		WebDriver driver=new InternetExplorerDriver();
		
	
	}

}
