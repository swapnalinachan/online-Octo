package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDataTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/swapnali/Desktop/table.html");
		
		String exp="Selemnium";
		
		List <WebElement> row=driver.findElements(By.xpath("//table[@id='123']/tbody/tr"));
		
		for(int i=0;i<=row.size();i++){
			List <WebElement> column=driver.findElements(By.xpath("//table[@id='123']/tbody/tr["+i+"]/td"));

			for(int j=0;j<=column.size()-1;j++){
				
				String act=column.get(j).getText();
				if(act.equals(exp)){
					System.out.println("Data found at index no "+i+" "+j);
					break;
				}
				
				
				
			}
		}

	}

}
