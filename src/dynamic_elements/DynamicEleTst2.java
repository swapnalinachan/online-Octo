


package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicEleTst2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://Users//swapnali//desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		WebElement CloseButton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		if(CloseButton.isDisplayed())
		{
			CloseButton.click();
		}

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi note 5 pro");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).sendKeys(Keys.ENTER);
		
		
		
		Thread.sleep(2000);
		

		String reviews=driver.findElement(By.xpath("(//span[@class='_2_R_DZ'])[1]")).getText();
		System.out.println(reviews);
	}

}

