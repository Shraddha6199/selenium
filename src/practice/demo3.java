package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		//create object of chromedriver class with reference to webdriver
		
		WebDriver driver=new ChromeDriver();
		
		//to enter url
     driver.get("https://kite.zerodha.com");
	//wait
     Thread.sleep(2000);
  
     //to get the title
    String S1=driver.getTitle();
	System.out.println(S1);
	//to close the tab
	
	//to get current url
	 String D1=driver.getCurrentUrl();
	 System.out.println(D1);
	 
	 driver.close();
	}
}
