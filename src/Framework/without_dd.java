package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_dd
{
	public static void main(String[] args) throws InterruptedException
	{
		 //step 1- 
		//paramater1=name of the browser
		//parameter2= path of chromedriver.exe file
			
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		
		   //step2=create object of the chromedriver class by providing reference of webdriver
	   WebDriver driver=new ChromeDriver();     //upasting
	   
	   //enter url
	   driver.get("https://demo.guru99.com/insurance/v1/index.php");
	   
	   driver.manage().window().maximize();
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //enter email
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saradeg41@gmail.com");
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //enter password
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sai@1117");
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //click on login button
	   driver.findElement(By.xpath("//input[@name='submit']")).click();
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //test case: verify email address
	  String  ExpectedEmailAddress="saradeg41@gmail.com";
	  
	  WebElement S1=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
	   String ActualEmailAddress=S1.getText();
	   
	   if(ExpectedEmailAddress.equals(ActualEmailAddress))
	   {
		   System.out.println("pass");
	   }
	   else
	   {
		   System.out.println("fail");
	   }
	   
	   
	}

}
