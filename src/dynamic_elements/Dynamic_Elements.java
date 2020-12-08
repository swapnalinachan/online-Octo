package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://Users//swapnali//desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(3000);

		WebElement closeButton=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		if(closeButton.isDisplayed()){
			closeButton.click();
		}
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("One plus");
				
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(8000);
		
		String firstresultname= driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]")).getText();
		
		String reviews=driver.findElement(By.xpath("(//span[@class='_38sUEc'])[1]/span")).getText();
		
		System.out.println(firstresultname);
		System.out.println(reviews);
		
		
		

	}

}
