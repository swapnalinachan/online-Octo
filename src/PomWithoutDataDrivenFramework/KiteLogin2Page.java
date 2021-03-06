

package PomWithoutDataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement Pin;
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement Continue;
	
	public KiteLogin2Page(WebDriver driver){
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void setKiteLogin2PagePin(){
		
		Pin.sendKeys("959594");
	}
	
	public void clickKiteLogin2PageContinue(){
		Continue.click();
	}
	
	

}
