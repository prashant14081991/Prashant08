package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CELLTYPE {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\excel\\selenium.xlsx\\");
		
		Cell mdm = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(4);
		
		CellType CelltypeInfo = mdm.getCellType();
		
		System.out.println(CelltypeInfo);
		
		
		if (CelltypeInfo==CellType.STRING) 
		{
			System.out.println(mdm.getStringCellValue());
		}
		else if (CelltypeInfo==CellType.NUMERIC) 
		{
			System.out.println(mdm.getNumericCellValue());
		}
		else if (CelltypeInfo==CellType.BOOLEAN)
		{
			System.out.println(mdm.getBooleanCellValue());
		}
}	
}	