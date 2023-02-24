package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insurance_TestClass 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		 //step 1- 
		//paramater1=name of the browser
		//parameter2= path of chromedriver.exe file
			
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		
		   //step2=create object of the chromedriver class by providing reference of webdriver
	   WebDriver driver=new ChromeDriver();     //upasting
	   
	   //enter url
	   driver.get("https://demo.guru99.com/insurance/v1/index.php");
	   
	   driver.manage().window().maximize();
	   
	   //wait
	   Thread.sleep(2000);
	   
	 //to read data from Excelsheet
	   FileInputStream file= new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
	   
	   Sheet Sh= WorkbookFactory.create(file).getSheet("Sheet5");
	   
	   //Create object of POM 1 class
	   Insurance_login Login=new Insurance_login(driver);
	   
	   //enter email
	    String EmailAdd=Sh.getRow(0).getCell(0).getStringCellValue();
	         Login.EnterEmail(EmailAdd);
	   
      //enter password
	         String Pass=Sh.getRow(1).getCell(0).getStringCellValue();
	         Login.EnterPassword(Pass);
	         
	   // click login
	         Login.LoginBttn();
	         
	   //Create object of POM II class
	   Insurance_broker_Insurance_Webpage Broker=new Insurance_broker_Insurance_Webpage(driver);
	  
	   //to verify email address
	   String Signin=Sh.getRow(2).getCell(0).getStringCellValue();
	   Broker.VerifyEmail(Signin);
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //click logout
	   Broker.logout();
}
}