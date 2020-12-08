package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenShot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub\
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
	File file1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	System.out.println(file1);
	File file2= new File("C:\\Users\\swapnali\\Desktop\\screenshot\\abc.jpg"); 
	FileHandler.copy(file1, file2);
	
	
		
		
		

	}

}
