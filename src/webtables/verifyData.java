package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/swapnali/Desktop/table.html");
		driver.findElements(By.xpath(""));
	}

}
