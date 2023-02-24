package TestNG_Assertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2
{
	@Test                                           //Test Case/Test Method
	public void TC3() 
	{
		Assert.fail();
		Reporter.log("Running TC3",true);
		
	}
	
	
	@Test                                           //Test Case/Test Method
	public void TC4() 
	{
		Reporter.log("Running TC4",true);
	}
	


}
