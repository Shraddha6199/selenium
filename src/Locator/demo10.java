package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo10
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url
		driver.get("https://www.facebook.com");
		
		//wait 
		Thread.sleep(3000);
		
driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();		

Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("wanare");     //surname

driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shraddha");//firstname

}
}