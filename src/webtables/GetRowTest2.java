package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRowTest2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/swapnali/Desktop/table.html");
		
		
		List <WebElement> row=driver.findElements(By.xpath("//table[@id='123']/tbody/tr"));
		
		System.out.println(row.size());
		
		for(WebElement ele:row){
			
			System.out.println(ele.getText());
		}
		

	}

}
