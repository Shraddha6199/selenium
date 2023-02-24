package Launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method4
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com");
	
	//to get title of webpage
		 String Title=driver.getTitle();
		 
		 System.out.println(Title);
		
	
	
	
	}

}
