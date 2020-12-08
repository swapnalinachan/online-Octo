package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://users//swapnali//desktop//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(button).perform();
		
		
		

	}

}
