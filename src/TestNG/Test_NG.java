package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_NG 
{
	@Test
	public void OpenFacebook() throws InterruptedException
	{
		//step 1- 
				//paramater1=name of the browser
				//parameter2= path of chromedriver.exe file
					
				System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
				
				   //step2=create object of the chromedriver class by providing reference of webdriver
			   WebDriver driver=new ChromeDriver();     //upasting
			   
			   //enter url
			   driver.get("https://www.facebook.com/");
			   
			   //wait
			   Thread.sleep(2000);
	}

}
