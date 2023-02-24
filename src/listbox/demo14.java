package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo14
{
	//multiselectable list box
		public static void main(String[] args) throws InterruptedException 
	    {
	  	  //step1:
	  	  //parameter 1: name of the browser
	  	  //parameter 2: path of chromedriver.exe file
	  	  System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
	  	  
			//step2: create object of chromedriver class by providing reference of webdriver (interface)
	  	  
	  	  WebDriver driver=new ChromeDriver();
	  	  
	  	  //to enter the url
	  	  driver.get("file:///C:/Users/ADMIN/AppData/Local/Microsoft/Windows/INetCache/IE/XGRLYLDR/MultiselectableListbox[1].html");
		
	  	  //wait
	  	  Thread.sleep(2000);
	  	  
	  	  //step1: identify listbox and store it into object 
	  	  WebElement multiselectable =driver.findElement(By.xpath("//select[@id='1234']"));
	  	  
	  	  //step2: create object of select class
	  	  Select S1=new Select(multiselectable);
	  	  
	  	  //step3:call the method
	  	  Boolean S2=S1.isMultiple();
	  	  System.out.println(S2);
	    }
}
