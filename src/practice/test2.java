package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//wait
	Thread.sleep(2000);

	             //       //Tagname[text()=�text value�]
	       driver.findElement(By.xpath("//a[text ()='Forgotten password?']")).click();
	

	}
}
