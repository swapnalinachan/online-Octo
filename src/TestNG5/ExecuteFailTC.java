package TestNG5;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ExecuteFailTC {
	@Test
	public void TC1(){
		Reporter.log("TC1");
	}
	@Test
	public void TC2(){
		Reporter.log("TC2");

}
	@Test
	public void TC3(){
		//Assert.fail();
		Reporter.log("TC3");
	}
}

