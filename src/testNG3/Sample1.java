package testNG3;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 {
	
	
	@Test 
	public void TC1(){
		Reporter.log("Running TC1");
	}
	
	@Test 
	public void TC2(){
		Reporter.log("Running TC2");
	}
	
	@Test 
	public void TC3(){
		Reporter.log("Running TC3");
	}
	

}
