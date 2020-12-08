package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demotst2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\swapnali\\Desktop\\Excel file\\Book1.xls");
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	 for(int i=0;i<=sh.getLastRowNum();i++)
	 {
		 for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++)
		 {
			 Cell cellvalue=sh.getRow(i).getCell(j);
			 if(cellvalue.getCellType()==CellType.STRING)
			 {
				 System.out.println(cellvalue.getStringCellValue()+" ");
			 }
		 }
	 }
		

	}
	

}
