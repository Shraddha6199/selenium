package Handling_of_dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//how to handle dynamic element
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
        
        //to cancel the hidden popup
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
        //wait
        Thread.sleep(2000);
       
        //to click on search text"
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vivo");
        
        //wait
        Thread.sleep(2000);
        
        //to click on search icon
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        
        //wait
        Thread.sleep(2000);
        
        //to identify the element
        WebElement Rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
        
        //wait
        Thread.sleep(2000);
        
        //to get the text
        String R1=Rating.getText();
        System.out.println(R1);
        
        


		
	}

}
