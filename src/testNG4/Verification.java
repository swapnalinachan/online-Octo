package testNG4;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
	
	@Test
	public void TC1(){
		
		Reporter.log("Runnning TC1");
		String act="abc";
		String exp="abc";
		//Assert.assertEquals(act, exp,"act and exp are not same");
		Assert.assertNotEquals(act, exp,"act and exp are same");

	}
	
	@Test
	public void TC2(){
		Reporter.log("Runnning TC2");
		boolean res=false;
		//Assert.assertTrue(res,"Result is failed");
		//Assert.assertFalse(res,"Condition is true");
		
	}
	
	@Test
	public void TC3(){
		Reporter.log("Runnning TC3");
		String str =null;
		//Assert.assertNull(str,"Not Null");
		Assert.assertNotNull(str,"Null");
		
	}
	@Test
	public void TC4(){
		Reporter.log("Runnning TC4");
		Assert.fail();
		
	}
	
	
	

}


//assertEquals()
//assertNotEquals()
//assertNull()
//assertNotNull()
//fail()
//assertTrue()
//assertFalse()