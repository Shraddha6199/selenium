package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url
		driver.get("https://www.facebook.com");
		
		//wait 
		Thread.sleep(3000);
		
		//click on forfotten password
		//XPATH BY TEXT
		
		                                              //s       //TAGNAME[TEXT()='TEXT VALUE']
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
		
	}

}
