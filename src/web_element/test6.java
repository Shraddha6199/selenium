package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.shrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url 
		driver.get("https://www.facebook.com/");
       //wait
		Thread.sleep(2000);
		WebElement S1=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		Boolean S2=S1.isDisplayed();
		System.out.println(S2);
		driver.close();
	}
}
