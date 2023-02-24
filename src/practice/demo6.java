package practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6
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
     //to set position of the browser
     Point S1=new Point(400,500);
     driver.manage().window().setPosition(S1);
     //wait
     Thread.sleep(2000);
     
     //to get position of the browser
    Point P1= driver.manage().window().getPosition();
    System.out.println(P1);
    driver.close();
}
}
