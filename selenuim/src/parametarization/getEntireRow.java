package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getEntireRow {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\selenium.xlsx\\");
		
		Sheet mdm = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastrowindex = mdm.getLastRowNum();
		
		for (int i = 0; i <= lastrowindex; i++) 
		{
			String str = mdm.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(str);
			
		}

}
}