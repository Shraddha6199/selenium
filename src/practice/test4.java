package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//wait
	Thread.sleep(2000);
    // driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("jungkook");

     driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
}
}
