package practice_types_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.shrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url by id
		driver.get("///C:/Users/ADMIN/AppData/Local/Microsoft/Windows/INetCache/IE/XGRLYLDR/name2[1].html");
		Thread.sleep(2000);
		driver.findElement(By.name("1234")).sendKeys("army");
		Thread.sleep(2000);
		driver.findElement(By.name("1234")).sendKeys("suga");
	
	

	
	
	
	
	}
	
	
	
	
	}
	
	
	
	
