package ctions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo4
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
	   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	   
	   driver.manage().window().maximize();
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //step1:identify the ele and store it into an object
	  WebElement S1= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	  
	  //step2: create object of action class
	  Actions  A1=new Actions(driver);
	  
	  //step3:call the methods
	  A1.doubleClick(S1).perform();
	   
	}

}
