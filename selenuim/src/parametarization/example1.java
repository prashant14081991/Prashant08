package parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\selenium.xlsx\\");
		
		String str = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
		
		System.out.println(str);
	}

}
