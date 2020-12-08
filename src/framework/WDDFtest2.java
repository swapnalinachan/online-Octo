package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WDDFtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vijay@123");
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		boolean result=driver.findElement(By.xpath("//span[text()='KV']")).isDisplayed();
		
		if(result){
			System.out.println("pass");
		}
		else{
			System.out.println("failed");
		}

	}

}
