package POM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass 
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
	   
	   //create object of login pom class
	   login S1=new login(driver);
	   //email
	  String Email=Sh.getRow(0).getCell(0).getStringCellValue();
	  S1.EnterEmail(Email);
	  Thread.sleep(2000);
	   
	  //password
	   String psw=Sh.getRow(1).getCell(0).getStringCellValue();
	   S1.EnterPassword(psw);
	   Thread.sleep(2000);
	   
	   //login
	  S1.clicklogin();
	  Thread.sleep(2000);
	  
	   //create object of broker class
	   broker S2=new broker(driver);
	    String Expected=Sh.getRow(2).getCell(0).getStringCellValue();
	    
	    //wait
	    Thread.sleep(2000);
	    
	    S2.VerifyEmail(Expected);
	    
	    //logout
	    S2.clicklogout();

}
}