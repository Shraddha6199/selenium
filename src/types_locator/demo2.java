package types_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2
{
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/ADMIN/AppData/Local/Microsoft/Windows/INetCache/IE/4NT43NH2/id1[2].html");
	
	Thread.sleep(2000);
	//username
	driver.findElement(By.id("abc123")).sendKeys("jimin@123");
	
	Thread.sleep(2000);
     //password
	driver.findElement(By.id("abc456")).sendKeys("bts123");
  }
}