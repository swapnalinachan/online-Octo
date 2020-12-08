package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetColumTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/swapnali/Desktop/table.html");
		
		
		List <WebElement> column=driver.findElements(By.xpath("//table[@id='123']/tbody/tr[2]/td"));
		

		for(WebElement ele:column){
			
			System.out.println(ele.getText());
		}
		
		
		
		

	}

}
