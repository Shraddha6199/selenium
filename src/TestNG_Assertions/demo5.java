package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo5 
{
	@Test                                                                          //Test Case/Method
	public void TC1()
	{
		String ActualResult=null;
       Assert.assertNull(ActualResult);
	}
	
 	@Test                                                                          //Test Case/Method
	public void TC2()
	{
		String ActualResult="Army";
		Assert.assertNull(ActualResult);
	}


}
