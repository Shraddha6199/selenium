package Launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_bowser2
{
	public static void main(String[] args) 
	{	
                           //step 1- 
	//paramater1=name of the browser
	//parameter2= path of chromedriver.exe file
		
	System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
	
	   //step2=create object of the chromedriver class by providing reference of webdriver
	
	WebDriver driver=new ChromeDriver();                   //UPCASTING
	
	
	}

}
