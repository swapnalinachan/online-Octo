package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxpractice {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty(webdriver.chrome.driver,
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https:wwww.facebook.com");

	driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
	
	
	Thread.sleep(5000);
	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	
		Select Sc =new Select(day);
		Sc.selectByValue("23");
		
		Select Sc2 =new Select(month);
        Sc2.selectByValue("12"); 
         
        Select Sc1 =new Select(year);
        Sc1.selectByValue("2020"); 
         
         System.out.print(Sc.getFirstSelectedOption().getText()+"/");
         System.out.print(Sc2.getFirstSelectedOption().getText()+"/");
         System.out.print(Sc1.getFirstSelectedOption().getText());
   
}
}