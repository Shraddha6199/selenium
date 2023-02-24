package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.shrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url 
		driver.get("https://www.facebook.com/");
Thread.sleep(2000);
//to enter un
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bts");
Thread.sleep(2000);
//clear un
driver.findElement(By.xpath("//input[@type='text']")).clear();
Thread.sleep(2000);
//enter un
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("korean");

}
}