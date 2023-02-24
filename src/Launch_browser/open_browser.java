package Launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class open_browser
{
	//HOW TO LAUNCH/OPEN/INVOKE THE BROWSER
	
	public static void main(String[] args) 
	{
		                  //STEP 1
		//parameter 1- name of the browser
		//parameter-2-path of Chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		
		
		                //STEP 2
		//create object of the Chromedriver class
		
		ChromeDriver driver=new ChromeDriver();             //classname objectname=new classname();
		
		
	}

}
