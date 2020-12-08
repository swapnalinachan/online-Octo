package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDataToWebtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/swapnali/Desktop/table.html");
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='123']/tbody/tr"));
		
		String st1="Manual";
		for(int i=2;i<=row.size();i++){
			
			int colSize=driver.findElements(By.xpath("//table[@id='123']/tbody/tr["+i+"]/td")).size();
			
			for(int j=1;j<=colSize;j++){
				
				String st2=driver.findElement(By.xpath("//table[@id='123']/tbody/tr["+i+"]/td["+j+"]")).getText();
				if(st1.equals(st2)){
					System.out.println("Req string found at index no "+i+" "+j);
					break;
				}
		
			}
			
		}
		

	}

}
