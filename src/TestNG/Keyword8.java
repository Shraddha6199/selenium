package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword8 
{
	@Test(timeOut=5000)                                                            //test case/method
	public void TC1() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("Running Method TC1" ,true);
	}
	
	@Test                                                              //test case/method
	public void TC2()
	{
		Reporter.log("Running Method TC2" ,true);
	}

}
