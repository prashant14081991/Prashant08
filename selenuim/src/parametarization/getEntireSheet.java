package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getEntireSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\selenium.xlsx\\");
		
		 Sheet munna = WorkbookFactory.create(file).getSheet("Sheet2");
		 
		 int rowIndex = munna.getLastRowNum();
		 
		 for (int i = 0; i <=rowIndex ; i++) 
		 {
			 short cellindex = munna.getRow(i).getLastCellNum();
			 
			 for (int j = 0; j <=cellindex-1 ; j++)
			 {
				System.out.print(munna.getRow(i).getCell(j).getStringCellValue()+"  ");
			}
			System.out.println();
		}

}
}