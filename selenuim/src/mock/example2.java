package mock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\munna1.xlsx\\");
		
		Sheet Sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int rowindex = Sheet.getLastRowNum();
		
		for (int i = 0; i <= rowindex; i++) {
			
			short cellindex = Sheet.getRow(i).getLastCellNum();
			
			for (int j = 0; j <= cellindex-1; j++) {
				
				 Cell cellinfo = Sheet.getRow(i).getCell(j);
				
				 CellType typecellinfo = Sheet.getRow(i).getCell(j).getCellType();
				 
				 Object value = null;
				 if (typecellinfo==CellType.STRING) {
					value=cellinfo.getStringCellValue();		
				}
				 else if (typecellinfo==CellType.NUMERIC) {
					value=cellinfo.getNumericCellValue();
				}
				 else if (typecellinfo==CellType.BOOLEAN) {
						value=cellinfo.getBooleanCellValue();
					}
				 System.out.print(value+" ");
			}
			
			System.out.println();
		}
		
	}

}
