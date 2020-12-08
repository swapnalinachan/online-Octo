package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verifyTypeOfCellTst1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\swapnali\\Desktop\\Excel file\\Book1.xls");
	    Cell cellvalue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1);
	    System.out.println(cellvalue.getCellType());

	    
	}

}
