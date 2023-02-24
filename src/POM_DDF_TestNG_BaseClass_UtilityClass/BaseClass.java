package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	 public WebDriver driver;
	
	public void InitializeBrowser()                       //non static method
	{
		       //step 1- 
				//paramater1=name of the browser
				//parameter2= path of chromedriver.exe file
					
				System.setProperty("webdriver.chrome.driver","\\C:\\newchrome\\chromedriver.exe\\");
				
				   //step2=create object of the chromedriver class by providing reference of webdriver
			   driver=new ChromeDriver();     //upasting
			   
			   //enter url
			   driver.get("https://demo.guru99.com/insurance/v1/index.php");
			   
			   driver.manage().window().maximize();
			   
			   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	

}
