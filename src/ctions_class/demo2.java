package ctions_class;

import org.openqa.selenium.By;
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
	   
	  //to enter the url
	   driver.get("https://www.flipkart.com/");
	   
	   driver.manage().window().maximize();
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //close hidden element
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   
	   //Step1:identify the ele and store in into an object
	WebElement  S1=driver.findElement(By.xpath("//span[text()='Cart']"));
	 
	 //step2: create object of actions class
	 Actions A1=new Actions(driver);
	 
	 //step3:call the method
	A1.contextClick(S1).perform();                        //right click

}

}