package Launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method3
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		
		//creation of object with reference to webdriver(interface)
		WebDriver driver=new ChromeDriver();
		
		//to open the application
		driver.navigate().to("https://www.onlinesbi.sbi/.");
		
		//wait
		Thread.sleep(5000);
		
		//to open the application
		driver.navigate().to("https://www.idbibank.in");
		
		//wait
		Thread.sleep(2000);
		
		//to move backward
		driver.navigate().back();
	
		//wait
		Thread.sleep(2000);
		
		//to move forward
		driver.navigate().forward();	
	
		//wait
		Thread.sleep(2000);
		
		//refresh
		driver.navigate().refresh();
		
	
	
	
	
	}

}
