package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	
	@Test
	public void TC1(){
		Assert.fail();
		Reporter.log("Running TC1",false);
		System.out.println("Runnig TC1 ");
	}
	public void TC2(){
		Reporter.log("Running TC1",false);
		System.out.println("Runnig TC1 ");
	}

}
