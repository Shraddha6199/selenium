package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.shrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url 
		driver.get("https://www.facebook.com/");
       //wait
		Thread.sleep(2000);
//to enter un
		 WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
		 text.sendKeys("army");
			 text.clear();
		 text.sendKeys("korean");
}
}