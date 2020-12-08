package pom_ddf_TestNg_BaseClass_Utility;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class KiteTest extends BaseClass {
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	int TCID;

	
	@BeforeClass
	public void openBrowser(){
		browserOpen();
		
		login1=new KiteLogin1Page(driver);
		login2=new KiteLogin2Page(driver);
		home=new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException{
		login1.setKiteLoginPageUN(utility.getTestData(0, 0));
		login1.setKiteLoginPagePWD(utility.getTestData(0, 1));
		login1.clickKiteLoginPageLogin();
		
		login2.setKiteLogin2PagePin(utility.getTestData(0, 2));
		login2.clickKiteLoginContinue();

	}
	@Test
	public void verifyPN() throws EncryptedDocumentException, IOException{
		TCID=550;
		String act=home.getKiteHomePageProfileName();
		String exp=utility.getTestData(0, 3);
		System.out.println(act);
		System.out.println(exp);
		
		Assert.assertEquals(act, exp,"Both are not same");

	}
	@AfterMethod
	public void LogOut(ITestResult result) throws IOException{
		
		if(result.getStatus()==ITestResult.FAILURE){
			utility.captureScreenShot(driver, TCID);
		}
	}
	@AfterClass
	public void CloseBrowser(){
		
		login1=null;
		login2=null;
		home=null;
		driver.close();
	
	}
	
}
