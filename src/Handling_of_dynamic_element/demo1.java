package Handling_of_dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1
{
	//how to handle dynamic element
	 //step 1- 
	//paramater1=name of the browser
	//parameter2= path of chromedriver.exe file
		
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
   
   //window maximize
   driver.manage().window().maximize();
   
  //to close the hidden element
   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   
   //to search
   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi note 10s");
   
   //wait
   Thread.sleep(2000);
   
   //to cllick search
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   
   //wait
   Thread.sleep(2000);
   
   //to identify rating element
   WebElement rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
   
   //wait
   Thread.sleep(2000);
   
   //to get text
   String r1=rating.getText();
   System.out.println(r1);
   
   

  }
}
