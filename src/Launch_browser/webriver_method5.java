package Launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webriver_method5 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//to get url of application
		 String URL=driver.getCurrentUrl();
		 System.out.println(URL);
		 driver.close();
	}	    

}
 