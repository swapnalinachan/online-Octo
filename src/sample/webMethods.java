package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://facebook.com/");
		driver.navigate().to("https://facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.close();
	String title=driver.getTitle();
	System.out.println(title);
String	  url=driver.getCurrentUrl();
System.out.println(url);
		driver.quit();
	
		
	}

}
