package MultipleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetNoOfLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 	driver.get("https://www.google.com/");
	 	List<WebElement> links=driver.findElements(By.xpath("//a"));
	    System.out.println("no of links present in webpage :" +links.size());
	    
//	    for(WebElement link:links){
//	    	
//	    	System.out.println(link.getText());
//	    	
//	    }
	    
	    for(int i=0;i<=links.size()-1;i++){
	    	
	    	System.out.println(links.get(i).getText());
	    }
	    
	
		
	}

}
