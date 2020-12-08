package PomWithoutDataDrivenFrameworkTest1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://kite.zerodha.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		login1.setKiteLogin1PageUN();
		login1.setKiteLogin1PagePWD();
		login1.clickKiteLogin1PageLoginButton();
		
		KiteLogin2Page login2=new KiteLogin2Page(driver);
		login2.setKiteLogin2PagePin();
		login2.clickKiteLogin2PageContinue();
		
		KiteHomePage verify=new KiteHomePage(driver);
		verify.verifyHomePagePN();

		
	}

}
