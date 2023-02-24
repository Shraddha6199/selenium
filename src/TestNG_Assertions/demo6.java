package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo6 
{
	@Test                                                                          //Test Case/Method
	public void TC1()
	{
		String ActualResult="army";
       Assert.assertNotNull(ActualResult);
	}
	
 	@Test                                                                          //Test Case/Method
	public void TC2()
	{
		String ActualResult=null;
		Assert.assertNotNull(ActualResult);
	}


}
