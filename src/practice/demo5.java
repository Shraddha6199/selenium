package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		//create object of chromedriver class with reference to webdriver
	      WebDriver driver=new ChromeDriver();
		
		//to enter url
     driver.get("https://kite.zerodha.com");
	//wait
     Thread.sleep(2000);
    //to get size of the browser
     
      Dimension S1=driver.manage().window().getSize();
      System.out.println(S1);     //(1050,708)
     Thread.sleep(2000);
      //to set size of the bowser
      Dimension D1=new Dimension(500,800);
      driver.manage().window().setSize(D1);
      
      driver.close();
      }
}