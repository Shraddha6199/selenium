package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 
{
	@Test                                                                          //Test Case/Method
	public void TC1()
	{
		String ExpectedResult="Army";
		String ActualResult="Army";
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	
 	@Test                                                                          //Test Case/Method
	public void TC2()
	{
		String ExpectedResult="Army";
		String ActualResult="BTS";
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	

}
