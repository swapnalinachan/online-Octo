package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",	"C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com/");	
	}

}
