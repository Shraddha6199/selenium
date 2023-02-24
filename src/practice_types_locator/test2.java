package practice_types_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.shrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url by id
		driver.get("file:///C:/Users/ADMIN/AppData/Local/Microsoft/Windows/INetCache/IE/2U0GDRM9/id1[1].html");
		Thread.sleep(2000);
		//username
		driver.findElement(By.id("abc123")).sendKeys("jimin");
		//password
		driver.findElement(By.id("abc456")).sendKeys("kim");
		

}
}