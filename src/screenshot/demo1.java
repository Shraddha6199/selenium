package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class demo1
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\newchrome\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		//to enter the url
		driver.get("https://www.facebook.com/");
		//wait
		Thread.sleep(2000);
		
		//Take screenshot of a webpage
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);

		File Destination=new File("D://screenshot//sample1.jpg");
		FileHandler.copy(source, Destination);
	}

}
