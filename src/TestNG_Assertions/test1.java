package TestNG_Assertions;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1
{
	@Test                                           //Test Case/Test Method
	public void TC1() 
	{
		Reporter.log("Running TC1",true);
	}
	
	
	@Test                                           //Test Case/Test Method
	public void TC2() 
	{
		Reporter.log("Running TC2",true);
	}
	


}
