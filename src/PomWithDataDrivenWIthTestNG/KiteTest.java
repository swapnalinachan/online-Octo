package PomWithDataDrivenWIthTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		FileInputStream file=new FileInputStream("C:\\Users\\swapnali\\Desktop\\Excel file\\logindetails.xls");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		login1.setKiteLoginPageUN(username);
		String pwd=sh.getRow(0).getCell(1).getStringCellValue();
		login1.setKiteLoginPagePWD(pwd);
		login1.clickKiteLoginPageLogin();

		KiteLogin2Page login2=new KiteLogin2Page(driver);
		String p=sh.getRow(0).getCell(2).getStringCellValue();
		login2.setKiteLogin2PagePin(p);
		login2.clickKiteLoginContinue();
		
		KiteHomePage verify=new KiteHomePage(driver);
		verify.verifyKiteHomePage();
		
		
	}

}
