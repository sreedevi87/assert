package MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {
@Test
public void test1() {
	SoftAssert sa=new SoftAssert();
	System.out.println("open browser");
	//hard assert
	//Assert.assertEquals(true, false,"browser did not open successfully");
	System.out.println("enter username");
	System.out.println("enter password");
	System.out.println("click on login");
	System.out.println("validate home page");
	//softassert
	sa.assertEquals(true, false,"validating home page failed");
	sa.assertAll();
	
}
@Test
public void test2() {
	SoftAssert sa=new SoftAssert();
	System.out.println("validating deals page");
	sa.assertEquals(true, true,"validating deals page failed");
	sa.assertAll();
}

}
