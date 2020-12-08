package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TypeOfCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\swapnali\\Desktop\\Excel file\\Book2.xls");
		Cell cvalue=WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(0);
		
		if(cvalue.getCellType()==CellType.STRING)
			System.out.println(cvalue.getStringCellValue());
		else if(cvalue.getCellType()==CellType.NUMERIC)
			System.out.println(cvalue.getNumericCellValue());
		else if(cvalue.getCellType()==CellType.BOOLEAN)
			System.out.println(cvalue.getBooleanCellValue());
		
	}

}
