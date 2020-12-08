package PomWithDataDrivenFrameworkTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {

	
	
	
	@FindBy(xpath="//input[@id='pin']")	
	private	WebElement pin;
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement ContinueButton;
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setKiteLogin2Pagepin(String p)
	{
		pin.sendKeys(p);
	}
	public void clickKiteLoginContinue()
	{
		ContinueButton.click();
	}

	
}
	



