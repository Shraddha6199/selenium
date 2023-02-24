package Launch_browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method8
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//to set the position of the application
		Point P1=new Point(300,600);
		driver.manage().window().setPosition(P1);
		
		//to get the position of the application 
		Point S1=driver.manage().window().getPosition();
		System.out.println(S1);
		
	

}
}