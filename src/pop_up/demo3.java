package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	   
	   //to enter the url
	   driver.get("https://demo.guru99.com/test/delete_customer.php");
	   
	   //wait
	   driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345abc");
	   
	   //wait
	   Thread.sleep(2000);
	  
	   //to click submit button
	   driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	   //to switch to focus to aler popup
	  Alert A3= driver.switchTo().alert();
	  
	  //wait
	 Thread.sleep(1000);
	 
	 //to get text present on alert popup
	 String S1=A3.getText();
	 System.out.println(S1);    //Do you really want to delete this Customer?
	  
	}
	  
	  
	  
	  
	  
	  

}
