package types_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ADMIN/AppData/Local/Microsoft/Windows/INetCache/IE/2U0GDRM9/tagname[1].html");
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("virat@5456");
		
		//enter password
		driver.findElement(By.tagName("input")).sendKeys("kohli1234");
		

}
}
