package Launch_browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method7 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Dimension S1=new Dimension(600,800);
		driver.manage().window().setSize(S1);
		
		//to get size
		 Dimension D1=driver.manage().window().getSize();
		 System.out.println(D1);
	}

}
