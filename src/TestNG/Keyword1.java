package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword1 
{
	//run multiple times
	@Test(invocationCount=10)
	public void TC1()
	{
		Reporter.log("Running method TC1",true);
	}

}
