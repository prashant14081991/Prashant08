package POM_DDF_TESTNG_BaseClass_utilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityClass {
	
	public static String testData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\munna1.xlsx");
		
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		 
		 String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		 
		 return value;
	}

	public static void screenshots(WebDriver driver, int TCID) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\munna\\eclipse-workspace\\selenuim\\Screenshots\\munna"+ TCID +".png");
		FileHandler.copy(src, dest);
	}
	
	public static String readPropertyFileData(String key) throws IOException {
		
		
		FileInputStream file1=new FileInputStream("C:\\Users\\munna\\eclipse-workspace\\selenuim\\property.properties");
		Properties mdm=new Properties();
		mdm.load(file1);
		String propRef = mdm.getProperty(key);
		return propRef;
		
	}
}
