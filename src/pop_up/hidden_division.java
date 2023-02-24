package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_division 
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
	   driver.get("https://www.flipkart.com");
	   
	   //wait
	   Thread.sleep(2000);
		
	   //to enter mob no
	   driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("army6199@gmail.com");
	   
	   //wait
	   Thread.sleep(1000);
	   
	   //click on request otp
	   driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	}
	

}
