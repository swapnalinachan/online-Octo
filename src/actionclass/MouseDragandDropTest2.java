package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDropTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://Users//swapnali//desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement source=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target=driver.findElement(By.xpath("//li[@class='placeholder']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
		

	}

}
