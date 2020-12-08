package autosuggentions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionsTst4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://Users//swapnali//desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("samsung note 20");
		
		Thread.sleep(2000);
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(options.size());
		
		String exp="samsung note 20 ultra";
			for(WebElement ele:options){
				String act=ele.getText();
				
				if(act.equals(exp)){
					ele.click();
					break;
				}
			}
		
		
		
		

	}

}
