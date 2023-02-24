package customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo3
{
	public static void main(String[] args) throws InterruptedException
	{
		 //step 1- 
		//paramater1=name of the browser
		//parameter2= path of chromedriver.exe file
			
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		
		   //step2=create object of the chromedriver class by providing reference of webdriver
	   WebDriver driver=new ChromeDriver();     //upasting
	   
	   //to enter url
	   driver.get("https://www.facebook.com/");
	   
	   //wait
	   Thread.sleep(2000);

	   //to click on new create account
	   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //to click on date
	   WebElement day=driver.findElement(By.id("day"));

	   //to create of actions class
	   Actions act=new Actions(driver);
	   
	   //call the method
	   act.click(day).perform();
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //to reach to the top
	   act.sendKeys(Keys.HOME).perform();
	   
	   //wait
	   Thread.sleep(2000);
	   
	   for(int i=0; i<=20;i++)
	   {
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   
	}
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //to enter /select the  option
	   act.sendKeys(Keys.ENTER).perform();
	   
	}
}
