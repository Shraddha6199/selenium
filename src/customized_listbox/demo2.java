package customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo2
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
	   
	   //Step1:identify element and store it into an object
	  WebElement  month=driver.findElement(By.id("month"));
	  
	  //create object of actions class
	  Actions act=new Actions(driver);
	  
	  //call the method
	  act.click(month).perform();
	  
	  //wait 
	  Thread.sleep(2000);
	  
	  //to move one step downward
	  act.sendKeys(Keys.ARROW_DOWN).perform();//feb
	  Thread.sleep(2000);
	  
	  act.sendKeys(Keys.ARROW_DOWN).perform();//mar
	  
	  act.sendKeys(Keys.ARROW_DOWN).perform();//apr
	  
	  act.sendKeys(Keys.ARROW_DOWN).perform();//may
	  
	  //wait
	  Thread.sleep(2000);
	  
	  //to move upward
	  act.sendKeys(Keys.ARROW_UP).perform();//apr
	  
	  act.sendKeys(Keys.ARROW_UP).perform();//march
	  
	  act.sendKeys(Keys.ARROW_UP).perform();//febs
	  
	   
	}
}
