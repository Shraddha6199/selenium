package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//wait
	Thread.sleep(2000);
	
	//to enter username
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("armybts");
	  
	//XPATH BY ATTRIBUTE
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("army@gmail.com");
	}

}
