package pom_ddf_TestNg_BaseClass_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	
	public static String getTestData(int row, int col) throws EncryptedDocumentException, IOException{

		FileInputStream file=new FileInputStream("C:\\Users\\swapnali\\Desktop\\Excel file\\logindetails.xls");
	    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	    String Value=sh.getRow(row).getCell(col).getStringCellValue();
	    return Value;
	}
	
	
	public static void captureScreenShot(WebDriver driver, int TCID) throws IOException{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\swapnali\\Desktop\\java\\online Octo\\screenshots\\"+TCID+".jpg");
		FileHandler.copy(source, dest);
		
	}

}
