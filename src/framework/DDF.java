package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\swapnali\\Desktop\\Excel file\\logindetails.xls");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		String un=sh.getRow(0).getCell(0).getStringCellValue();
		String pass=sh.getRow(0).getCell(1).getStringCellValue();
		String pin=sh.getRow(0).getCell(2).getStringCellValue();
				
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		
				
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		
		//enter userid
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
		
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		
		//login
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		boolean result=driver.findElement(By.xpath("//span[text()='KV']")).isDisplayed();
		
		System.out.println(result);
		
		if(result){
			System.out.println("pass");
		}
		else{
			System.out.println("failed");
		}

	}

}
