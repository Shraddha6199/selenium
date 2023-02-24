package practice_types_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.shrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//to get url by id
		driver.get("file:///C:/Users/ADMIN/AppData/Local/Microsoft/Windows/INetCache/IE/4NT43NH2/name1[1].html");
		Thread.sleep(2000);
		driver.findElement(By.name("1234")).sendKeys("army");
		Thread.sleep(2000);
		driver.findElement(By.name("5678")).sendKeys("suga");

}
}