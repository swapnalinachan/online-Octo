package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c://users//swapnali//desktop//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement source=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest=driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		
		Actions act=new Actions(driver);
		
		//act.clickAndHold(source).moveToElement(dest).release().build().perform();
		act.dragAndDrop(source, dest).perform();

	}

}
