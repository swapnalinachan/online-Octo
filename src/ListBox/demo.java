package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
//		WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
//		Select s=new Select(month);
	//	s.selectByValue("3");
	//	s.selectByVisibleText("Mar");
	//	s.selectByIndex(3);
	// WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
	 //Select s=new Select(year);
	 //s.selectByValue("1996");
	WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
	Select s=new Select(day);
	s.selectByValue("23");
		
	}

}
