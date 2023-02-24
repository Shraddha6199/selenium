package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo3 
{
	@Test                                //Test Case/method
	public void TC1() 
	{
		
	   boolean	ActualResult=true;
		
		Assert.assertTrue(ActualResult);
	}
	
	
	@Test                                //Test Case/method
	public void TC2() 
	{
		
	   boolean	ActualResult=false;
		
		Assert.assertTrue(ActualResult);
	}
	


}
