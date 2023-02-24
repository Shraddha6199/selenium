package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
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
	   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //to switch to iframe{String Framename}
	   driver.switchTo().frame("iframeResult");
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //to click on display and time button
	   driver.findElement(By.xpath("//button[@type='button']")).click();

}
}