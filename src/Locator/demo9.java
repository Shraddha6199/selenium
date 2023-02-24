package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url
		driver.get("https://www.facebook.com");
		
		//wait 
		Thread.sleep(3000);
		
		//xpath by contains
		//  //tagname[contains(text(),'text value')]
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
	     
	}
}
