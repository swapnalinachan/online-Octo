package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class DynamicElement1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://Users//swapnali//desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement close_button=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		if(close_button.isDisplayed())
			close_button.click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("One plus");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	}

	
}
