package autosuggentions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggetions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 	driver.get("https://www.google.com/");
	 	
	 	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");
	 	
	 	Thread.sleep(2000);
	 	
	 	List<WebElement>option =driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	 	System.out.println(option.size());
	 	
	 	String exp="oneplus 7";
	 	//int i=1;
	 	for(WebElement ele:option){
	 		//i++;
	 		String act=ele.getText();
	 		if(act.equals(exp)){
	 			ele.click();
	 			//System.out.println("postion of "+exp+"is"+i);
	 			break;
	 		}
	 		
	 	}

	}

}
