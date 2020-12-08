package Excelsheet;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNumericCelltst1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\swapnali\\Desktop\\Excel file\\Book1.xls");
		double value=WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(value);
		

	}

}
