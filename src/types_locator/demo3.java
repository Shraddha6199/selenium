package types_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ADMIN/AppData/Local/Microsoft/Windows/INetCache/IE/K9YLP5K2/name1[1].html");
		
		Thread.sleep(2000);
		driver.findElement(By.name("1234")).sendKeys("jimin@123");
		
		Thread.sleep(2000);
		driver.findElement(By.name("5678")).sendKeys("armybts");
	}

}
