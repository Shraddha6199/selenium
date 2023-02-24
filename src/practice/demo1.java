package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		//create object of chromedriver class with reference to webdriver
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		
		//wait 
		Thread.sleep(2000);

		//to close current tab of browser
		driver.close();
	}

}
