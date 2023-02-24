package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3
{
	public static void main(String[] args) throws InterruptedException 
	{

	 //step 1- 
	//paramater1=name of the browser
	//parameter2= path of chromedriver.exe file
		
	System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
	
	   //step2=create object of the chromedriver class by providing reference of webdriver
  WebDriver driver=new ChromeDriver();     //upasting
  
  //to enter the url
  driver.get("file:///C:/Users/ADMIN/AppData/Local/Microsoft/Windows/INetCache/IE/2U0GDRM9/Table1[1].html");
  
  driver.manage().window().maximize();
  
  //wait
  Thread.sleep(2000);
  
  //to fetch manual
  WebElement S1=driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td[2]"));
  
  String S2=S1.getText();
  System.out.println(S2);    //manual

}
}