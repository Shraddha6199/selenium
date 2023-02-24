package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo2
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\\\chromedriver_win32\\\\chromedriver.exe\\");
		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver =new ChromeDriver();
		
		//to enter url
		driver.get("https://kite.zerodha.com");
		
		//wait
		Thread.sleep(2000);
		
		//take screen shot
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);

	File Destination=new File("D://screenshot//sample2.jpg");
	FileHandler.copy(source, Destination);
		
	}

}
