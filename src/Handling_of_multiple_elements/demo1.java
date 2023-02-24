package Handling_of_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	//how to handle multiple element
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
	   
	   //to identify link
	    List<WebElement> Alllinks=driver.findElements(By.xpath("//a"));    //46
	    
	    for(WebElement W1:Alllinks)
{
	System.out.println(W1.getText());
}
      }
	}

