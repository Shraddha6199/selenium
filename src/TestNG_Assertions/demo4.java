package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo4
{
	@Test                                //Test Case/method
	public void TC1() 
	{
		
	   boolean	ActualResult=false;
		
		Assert.assertFalse(ActualResult);
	}
	
	
	@Test                                //Test Case/method
	public void TC2() 
	{
		
	   boolean	ActualResult=true;
		
		Assert.assertFalse(ActualResult);
	}
	

}
