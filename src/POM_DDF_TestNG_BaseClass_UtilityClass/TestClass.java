package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
	//public WebDriver driver;
	//InitializeBrowser                   non static method
	
	Insurance_Login Login;
	Insurance_Broker_Insurance_Webpage broker;
	int TestCaseID;
	
	@BeforeClass
	public void OpenBrowser()
	{
	   	InitializeBrowser();                         //to call non static method in other non static method we can directly call by method name();
	   	
	   	//create object of POM class 1
	   	 Login=new Insurance_Login(driver);
	   	 
	   	 //create object of POM class2
	   	  broker=new Insurance_Broker_Insurance_Webpage(driver);
	}

	@BeforeMethod
	public void LoginToApp() throws IOException
	{
		Login.EnterEmail(UtilityClass.getDatafromPF("EM"));                         //saradeg41@gmail.com
		Login.EnterPassword(UtilityClass.getDatafromPF("PSW"));             //Sai@1117
		Login.LoginBttn();
	}
	
	@Test(priority=1)
	public void VerifyEmailAddress() throws IOException
	{
		 TestCaseID=10;
		//verify  email address
		String ActualEmail=broker.getEmail();             //saradeg41@gmail.com
		String ExpectedEmail=UtilityClass.getdataFromExcelsheet(2,0);
		Assert.assertEquals(ActualEmail, ExpectedEmail);
	}
	
	@Test(priority=2)
	public void VerifyTilte() throws IOException 
	{
		TestCaseID=11;
        String ActualTitle=driver.getTitle();
        String ExpectedTitle=UtilityClass.getdataFromExcelsheet(3,0);
        Assert.assertEquals(ActualTitle, ExpectedTitle);  
        
	}
	@AfterMethod
	public void  LogoutFromApp(ITestResult Result) throws IOException
	{
		if(Result.getStatus()==ITestResult.FAILURE)
	      {
	    	  UtilityClass.CaptureScreenshot(driver,TestCaseID);
	      }
	      broker.logout();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
}

