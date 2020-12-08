package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://Users//swapnali//desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement CloseButton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		if(CloseButton.isDisplayed())
		{
			CloseButton.click();
		}
		
		WebElement login=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		act.moveToElement(login).perform();
		//act.click().perform();

	}

}
