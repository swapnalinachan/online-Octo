package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword {
	
	@Test(timeOut=5000)
	public void Login() throws InterruptedException{
		Thread.sleep(6000);
		System.out.println("to login app");

	}
	
	@Test(invocationCount=10)
	public void TC1(){
		System.out.println("Running TC1");
	}
	
	
	@Test( dependsOnMethods={"Login"})
	public void TC2() {
		System.out.println("Running TC2");
	}
	
	

}
