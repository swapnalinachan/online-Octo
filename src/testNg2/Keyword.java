package testNg2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword {
	
	
	
	@Test()
	public void TC1() throws InterruptedException{
		System.out.println("Running TC1");
	}
	
	@Test( dependsOnMethods={"TC3"})
	public void TC2(){
		System.out.println("Running TC2");
	}
	
	@Test ()
	public void TC3(){
		System.out.println("Running TC3");
	}
	
	
}


//priority=1
//invoationCount=10
//enabled=false
//timeOut=5000
//dependsOnMethods={"methodNmae"}