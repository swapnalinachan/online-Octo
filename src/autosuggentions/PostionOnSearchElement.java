package autosuggentions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PostionOnSearchElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 	driver.get("https://www.google.com/");
	 	
	 	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("realme");
	 	
	 	Thread.sleep(2000);
	 	
	 	List<WebElement>option =driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	 	System.out.println(option.size());
	 	String exp="realme 7 pro";
	 	for(int i=0;i<=option.size()-1;i++){
	 		String act=option.get(i).getText();
	 		if(act.equals(exp)){
	 			System.out.println("The position of "+exp+" is "+(i+1));
	 			
	 			
	 			
	 			break;
	 		}
	 		
	 	}

	}

}

