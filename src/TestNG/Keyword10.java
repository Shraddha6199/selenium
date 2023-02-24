package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword10 
{
	@Test                                                                //test case/method
	public void Login()
	{
		Assert.fail();
		Reporter.log("Running Login TC" ,true);
	}
	
	@Test (dependsOnMethods= {"Login"})                                //test case/method
	public void Logout()
	{
		Reporter.log("Running Logout TC" ,true);
	}

}
