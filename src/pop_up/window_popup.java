package pop_up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_popup 
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
	   driver.get("https://skpatro.github.io/demo/links/");
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //to click on new tab button
	   driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //to get the ids
	  Set<String >ids =driver.getWindowHandles();
	  
	  //create object of array list
	  ArrayList<String>  Alt=new ArrayList<String> (ids);  
	  
	  //to get main page id
	  String mpid=Alt.get(0);
	  System.out.println(mpid);
	  
	  //to get id of childwindow
	  String cwid=Alt.get(1);
	  System.out.println(cwid);
	  
	  //to switch to child window id
	  driver.switchTo().window(cwid);
	  
	  //click on training
	  driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
	  
	  //wait
	  Thread.sleep(2000);
	  
	  //switch focus to main page
	  driver.switchTo().window(mpid);
	  
	  //wait
	  Thread.sleep(2000);
	  
	  //click on new window tab
	  driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.quit();
	  
	  
	   

}
}
