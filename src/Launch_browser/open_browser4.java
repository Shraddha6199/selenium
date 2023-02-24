package Launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_browser4 
{
	public static void main(String[] args) throws InterruptedException
	{
		 //step 1- 
		//paramater1=name of the browser
		//parameter2= path of chromedriver.exe file
			
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		
		   //step2=create object of the chromedriver class by providing reference of webdriver
	   WebDriver driver=new ChromeDriver();
	  driver.get("https://www.instagram.com");
	  
	  //wait
	 Thread.sleep(5000);
	  
	  //to close the tab
	 driver.close();
	
	  
	 
}
}
