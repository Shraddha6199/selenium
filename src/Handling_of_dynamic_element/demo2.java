package Handling_of_dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
	//how to handle multiple element
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
  
  driver.manage().window().maximize();
  
  //wait
  Thread.sleep(2000);
  
  //to close hidden element
  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
  
  //wait
  Thread.sleep(2000);
  
  //to text real me
  driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("vivo");
  
  // to click on search
  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
  
  //wait
  Thread.sleep(2000);
  
  //identify review element
 WebElement review=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]"))  ;
 
 //wait
 Thread.sleep(2000);
 
 //to get text
String S1= review.getText();
System.out.println(S1);
  
	  
  
  

}
}
