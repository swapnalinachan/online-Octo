package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	WebElement	CreateNewAcc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
boolean	 result=CreateNewAcc.isDisplayed();
System.out.println(result);
if(result==true)
{
	System.out.println("element displayed on webpage");
}
else
{
	System.out.println("element not displayed on webpage");
}
	}

}
