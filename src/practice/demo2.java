package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		//create object of chromedriver class with reference to webdriver
		
		WebDriver driver=new ChromeDriver();
		
		//to enter url
		driver.navigate().to("https://www.facebook.com/login.php");
		//wait
	Thread.sleep(2000);
	//to enter url
	driver.navigate().to("https://kite.zerodha.com");
	//wait
	Thread.sleep(2000);
	//to move backward
	driver.navigate().back();
	//wait
	Thread.sleep(2000);
	//to move forward
	driver.navigate().forward();
	//wait
	Thread.sleep(2000);
	//refresh
	driver.navigate().refresh();
	//wait
	Thread.sleep(3000);
	//close all tabs
	driver.quit();
	}
}