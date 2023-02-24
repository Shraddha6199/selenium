package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.shrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url 
		driver.get("https://www.facebook.com/");
       //wait
		Thread.sleep(2000);
		//to verify login button is enabled
		WebElement S1=driver.findElement(By.xpath("//button[text()='Log in']"));
		Boolean S2=S1.isEnabled();
		System.out.println(S2);
	}
}
