package testNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	@Test
	public void TC1(){
		
		SoftAssert soft=new SoftAssert();
		
		Reporter.log("Runnning TC1");
		String act="abc";
		String exp="xyz";
		soft.assertEquals(act, exp,"act and exp are not same");
		soft.assertEquals(act, exp,"act and exp are same");
		System.out.println("both are not same ");
		soft.assertAll();
	}

}
