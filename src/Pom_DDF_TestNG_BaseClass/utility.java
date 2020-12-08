package Pom_DDF_TestNG_BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility {
	
	public static String getTestData(int row, int col) throws EncryptedDocumentException, IOException{

		FileInputStream file=new FileInputStream("C:\\Users\\swapnali\\Desktop\\Excel file\\logindetails.xls");
	    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	    String Value=sh.getRow(row).getCell(col).getStringCellValue();
	    return Value;
	}
	

}
