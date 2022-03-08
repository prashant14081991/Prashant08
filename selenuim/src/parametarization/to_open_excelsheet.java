package parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class to_open_excelsheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	

 FileInputStream mdm = new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\selenium.xlsx\\");
	
	//String value = WorkbookFactory.create(mdm).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	//System.out.println(value);
	
	//boolean value1 = WorkbookFactory.create(mdm).getSheet("Sheet1").getRow(1).getCell(3).getBooleanCellValue();
	//System.out.println(value1);
 
 	double value2 = WorkbookFactory.create(mdm).getSheet("Sheet1").getRow(2).getCell(3).getNumericCellValue();
 	System.out.println(value2);
}
}
