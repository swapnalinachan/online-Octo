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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest {
	
	WebDriver driver;
	Sheet sh;
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage verify;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\swapnali\\Desktop\\Excel file\\logindetails.xls");
	    sh=WorkbookFactory.create(file).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    login1=new KiteLogin1Page(driver);
		login2=new KiteLogin2Page(driver);
	    verify=new KiteHomePage(driver);
	 }
	
	@BeforeMethod
	public void LoginToApp()
	{
		login1.setKiteLoginPageUN(sh.getRow(0).getCell(0).getStringCellValue());
		
		login1.setKiteLoginPagePWD(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickKiteLoginPageLogin();

		login2.setKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.clickKiteLoginContinue();
	}
	
	@Test
	public void VerifyPN()
	{

	verify.verifyKiteHomePage();
	}
	
	@AfterMethod
	public void LogoutFromApp()
	{
		
	}
	
	@AfterClass 
	public void CloseBrowser()
	{
		login1=null;
		login2=null;
		verify=null;
		driver.close();
	}

}
