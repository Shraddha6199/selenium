package Launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method1 
{
	public static void main(String[] args)
	{
		//how to launch the browser
		//step1= parameter1=name of the browser
		//parameter2=path of the chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		
		  //create object of chromedriver class		
		ChromeDriver driver=new ChromeDriver();
		
		
	}

}
