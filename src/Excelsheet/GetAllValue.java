package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\swapnali\\Desktop\\Excel file\\Book2.xls");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet3");
		
		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getRow(0).getLastCellNum());
		
		for(int i=0;i<=sh.getLastRowNum();i++){
			
			for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++){
				
				Cell cvalue=sh.getRow(i).getCell(j);

				if(cvalue.getCellType()==CellType.STRING)
					System.out.print(cvalue.getStringCellValue());
				else if(cvalue.getCellType()==CellType.NUMERIC)
					System.out.print((long)cvalue.getNumericCellValue());
				else if(cvalue.getCellType()==CellType.BOOLEAN)
					System.out.print(cvalue.getBooleanCellValue());
								
			}
			System.out.println();
			
			
		}
		
		
		
		

	}

}
