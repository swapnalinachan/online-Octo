package pom_ddf_TestNg_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	
	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	@FindBy(xpath="//input[@type='password']") private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']") private WebElement Login;
	
	public KiteLogin1Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setKiteLoginPageUN(String username ){
		UN.sendKeys(username);
	}
	
	public void setKiteLoginPagePWD(String pwd ){
		PWD.sendKeys(pwd);
	}
	public void clickKiteLoginPageLogin(){
		Login.click();
	}
	

}
