package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multi_browser
{
	@Parameters("browserName")                   //chrome   firefox

	@Test
	public void TC1(String browserName) throws InterruptedException 
	{
		WebDriver driver=null;
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		 driver=new ChromeDriver();
			
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "\\C:\\firefox\\geckodriver.exe\\");
		     driver=new FirefoxDriver();
			
		}
		
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


