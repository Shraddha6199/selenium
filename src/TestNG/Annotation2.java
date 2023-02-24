package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 
{
	@BeforeClass
    public void OpenBrowser()
	{
		Reporter.log("Open Browser",true);
	}

@BeforeMethod
public void LoginToApp()
{
	Reporter.log("login to app",true);
}

@Test                                         //Test case/test method
public void TC1()
{
   //verify email address
   Reporter.log("Running method TC1",true);
}

@Test
public void TC2()
{
	Reporter.log("Running method TC2",true);
}

@AfterMethod
public void LogoutFromApp()
{
   Reporter.log("logout",true);
}

@AfterClass
public void CloseBrowser()
{
   Reporter.log("Close Browser",true);
}

}
