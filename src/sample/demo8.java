package sample;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Dimension d= new Dimension(400,600);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		Point p= new Point(700,900);
		driver.manage().window().setPosition(p);
	}

}
