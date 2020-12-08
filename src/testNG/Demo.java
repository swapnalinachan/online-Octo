package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("login to app");
	}
	@Test
	public void TC1()
	{
		System.out.println("Running TC1");
	}
	@Test
	public void TC2()
	{
		System.out.println("Running TC2");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout to app");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}

}
