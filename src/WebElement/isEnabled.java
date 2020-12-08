package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	WebElement	CreateNewAcc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
boolean	 Result=CreateNewAcc.isEnabled();
System.out.println(Result);
if(Result== true)
{
	System.out.println("element enabled");
}
else
{
	System.out.println("element disabled");
}
	}

}
