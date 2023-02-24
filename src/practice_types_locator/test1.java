package practice_types_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.shrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url by tagname
		driver.get("file:///C:/Users/ADMIN/AppData/Local/Microsoft/Windows/INetCache/IE/4NT43NH2/tagname[1].html");
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("virat");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("kohli");

}
}