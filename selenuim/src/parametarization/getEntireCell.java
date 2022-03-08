package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getEntireCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\selenium.xlsx\\");
		
		Sheet mdm = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastcellINdex = mdm.getRow(2).getLastCellNum()-1;
		
		for (int i = 0; i <= lastcellINdex; i++) 
		{
			String str = mdm.getRow(2).getCell(i).getStringCellValue();
			
			System.out.print(str+" ");
		}
		System.out.println();
}
}