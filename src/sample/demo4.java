package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
 WebDriver driver	= new ChromeDriver();
 
 driver.get("https://www.amazon.in/");
 String exp="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
 String act=driver.getTitle();
 if(act.equals(exp))
 {
	 System.out.println("amazon home page open");
 }
 else
 {
	 System.out.println("amzon home page not open");
 }

	}

}
