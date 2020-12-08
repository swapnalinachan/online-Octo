package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement female=driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		boolean result=female.isSelected();
		System.out.println(result);
		if(result==true)
			
		{
			System.out.println("selected");
		}
		else{
			System.out.println("not selected");
		}
	}


}
