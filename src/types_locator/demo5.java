package types_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\\\chromedriver_win32\\\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ADMIN/AppData/Local/Microsoft/Windows/INetCache/IE/4NT43NH2/class1[1].html");
		
		Thread.sleep(2000);
		//username by classname
		driver.findElement(By.className("xyz12")).sendKeys("jungkook");
		
		Thread.sleep(2000);
		//password by password
		driver.findElement(By.className("xyz34")).sendKeys("bts");


	}
}
