package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getSheetByVerifyingCelltype {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\munna1.xlsx\\");
		
		 Sheet munna = WorkbookFactory.create(file).getSheet("Sheet1");
		 
		 int rowIndex = munna.getLastRowNum();
		 
		 for (int i = 0; i <=rowIndex ; i++) 
		 {
			 int cellindex = munna.getRow(i).getLastCellNum()-1;
			 
			 for (int j = 0; j <=cellindex; j++) {
				 
				 CellType TypeOFCellInfo = munna.getRow(i).getCell(j).getCellType();
				  
				  if (TypeOFCellInfo==CellType.STRING) {
					  System.out.print(munna.getRow(i).getCell(j).getStringCellValue()+" ");	
				}
				  else if (TypeOFCellInfo==CellType.NUMERIC) {
					System.out.print(munna.getRow(i).getCell(j).getNumericCellValue()+" ");
				}
				  else if (TypeOFCellInfo==CellType.BOOLEAN) {
					  System.out.print(munna.getRow(i).getCell(j).getBooleanCellValue()+" ");
					  
				}
				  
			}
			 System.out.println();
		 }
}
}