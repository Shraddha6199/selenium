package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		 //tagname[@attribute name = 'attribute value']
		//username
     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("suga_bts");
     
   Thread.sleep(3000);
         //password
          driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("army");
	}

	

}
