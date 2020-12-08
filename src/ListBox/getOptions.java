package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
		Select s=new Select(month);
		List<WebElement> options=s.getOptions();
		System.out.println(options.size());
//		for(int i=0; i<options.size();i++){
//			
//			System.out.println(options.get(i).getText());
//		
//		}
		
		for(WebElement ele:options){
			
			System.out.println(ele.getText());
		}
	}

}
