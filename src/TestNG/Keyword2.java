package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword2
{
	@Test (priority=2)                                //test case/method
	public void TC1()
	{
		Reporter.log("Running Method TC1" ,true);
	}
	
	@Test (priority=1)                                //test case/method
	public void TC2()
	{
		Reporter.log("Running Method TC2" ,true);
	}
	

}
