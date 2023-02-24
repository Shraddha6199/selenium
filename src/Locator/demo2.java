package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo2 
{
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//wait
	Thread.sleep(2000);	
	
	//to enter password
	//XPATH BY ATTRIBUTE
	driver.findElement(By.xpath("//input [@type='password']")).sendKeys("taehyung");
	
    }
}
