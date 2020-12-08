package customize_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizeBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c://users//swapnali//desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.id("month"));
		
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		
		
		for(int i=0;i<=12;i++){
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		
		for(int i=1;i<=4;i++){
			act.sendKeys(Keys.ARROW_DOWN).perform();;
			Thread.sleep(1000);
		}
		
		//act.click().perform();
		act.sendKeys(Keys.ENTER).perform();
		
		

	}

}
