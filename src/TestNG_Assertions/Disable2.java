package TestNG_Assertions;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable2
{
	//by using include
	@Test                                    //Test Case/Test Method
	public void TC1() 
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test                                           //Test Case/Test Method
	public void TC2() 
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test                                           //Test Case/Test Method
	public void TC3() 
	{
		Reporter.log("Running TC3",true);
	}
	
	@Test                                           //Test Case/Test Method
	public void TC4() 
	{
		Reporter.log("Running TC4",true);
	}
	

}
