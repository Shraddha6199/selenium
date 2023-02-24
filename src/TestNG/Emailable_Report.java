package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report

{
	@Test                                                                                                                     //Test Case/Testmethod
	public void m1()
	{
		Reporter.log("Running  method m1",true);                                              //print in console
	}
	@Test
	public void m2()
	{
		Assert.fail();
		Reporter.log("Running method m2",true);                                              //print in console
	}
	@Test
	public void m3()
	{
		Reporter.log("Running method m3",false);
	}
   @Test
   public void m4()
   {
	   Reporter.log("Running method m4");
   }
   @Test
   public void m5()
   {
	   System.out.println("Running method m5");
   }
}
