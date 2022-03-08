package parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getRowIndex {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\selenium.xlsx\\");
		
		Sheet mdm = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int rowIndex = mdm.getLastRowNum();
		
		System.out.println(rowIndex);   //returns row index
		
		int rowcount = mdm.getLastRowNum()+1;
		
		System.out.println(rowcount);   //total num of rows
		
	}
}
