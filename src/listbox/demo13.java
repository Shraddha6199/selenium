package listbox;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo13 
{
	public static void main(String[] args) throws InterruptedException 
    {
  	  //step1:
  	  //parameter 1: name of the browser
  	  //parameter 2: path of chromedriver.exe file
  	  System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
  	  
		//step2: create object of chromedriver class by providing reference of webdriver (interface)
  	  
  	  WebDriver driver=new ChromeDriver();
  	  
  	  //to enter the url
  	  driver.get("https://www.facebook.com");
  	  
  	  //wait
  	  Thread.sleep(2000);

  	  //click create new account
  	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 
	 //wait
	 Thread.sleep(2000);
	 
	 //step1: identify listbox and store it into object
	  WebElement Month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	  
	  //step2:create object of select class
	  Select S2=new Select(Month);
	  
	  //step3: call the method
	  Boolean S1=S2.isMultiple();
	  System.out.println(S1);

}
}