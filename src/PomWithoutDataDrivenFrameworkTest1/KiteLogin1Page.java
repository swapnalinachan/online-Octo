package PomWithoutDataDrivenFrameworkTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement UN;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement PWD;
	
	@FindBy(xpath="//button[text()='Login ']")
	private WebElement LoginButton;

	
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setKiteLogin1PageUN()
	{
		UN.sendKeys("DV1510");
	}
	public void setKiteLogin1PagePWD()
	{
		PWD.sendKeys("Vijay@123");
	}
	public void clickKiteLogin1PageLoginButton()
	{
		LoginButton.click();
	}

}
