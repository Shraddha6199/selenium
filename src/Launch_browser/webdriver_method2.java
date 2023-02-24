package Launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method2 
{
	public static void main(String[] args) throws InterruptedException
	{
             System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");		
             
             //creation of object with reference to webdriver(interface)               //upcasting
             WebDriver driver=new ChromeDriver();
             
             //to open an application
            driver.get("https://www.onlinesbi.sbi/.");
            
            //waiting process
            Thread.sleep(200);
            
            //to delete all the tabs
            driver.quit();
            
            
             
             
	}

}
