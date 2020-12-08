package autosuggentions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion_Tst3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//swapnali//Desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String exp="realme 7";
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("realme");
		Thread.sleep(2000);
		List<WebElement> options=	driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(options.size());
		
		for(WebElement ele:options){
			
			String act=ele.getText();
			if(exp.equals(act)){
				ele.click();
				break;
			}
			
			
		}
		
		

	}

}
