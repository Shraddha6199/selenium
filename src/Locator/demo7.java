package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url
		driver.get("https://kite.zerodha.com");
		
		//wait
		Thread.sleep(3000);
		
		//xpath by contians
		        //tagname[contains(@attribute name,'attribute value')]
		driver.findElement(By.xpath("//input[contains(@id,'userid')]")).sendKeys("jimin");

}
}
