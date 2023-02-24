package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 
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
    //to maximize the webpage
     driver.manage().window().maximize();
     //wait
     Thread.sleep(2000);
     //to minimize the browser
     driver.manage().window().minimize();
   }
}