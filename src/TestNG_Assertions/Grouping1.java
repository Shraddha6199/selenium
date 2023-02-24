package TestNG_Assertions;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping1
{
	@Test(groups="car insurance")                                    //Test Case/Test Method
	public void TC1() 
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test(groups="car insurance")                                         //Test Case/Test Method
	public void TC2() 
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test(groups="health insurance")                                            //Test Case/Test Method
	public void TC3() 
	{
		Reporter.log("Running TC3",true);
	}
	
	@Test (groups="health insurance")                                           //Test Case/Test Method
	public void TC4() 
	{
		Reporter.log("Running TC4",true);
	}
	
	@Test (groups="retirement insurance")                                           //Test Case/Test Method
	public void TC5() 
	{
		Reporter.log("Running TC5",true);
	}
	


}
