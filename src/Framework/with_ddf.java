package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_ddf 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		//with data driven framework
		 //step 1- 
		//paramater1=name of the browser
		//parameter2= path of chromedriver.exe file
			
		System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
		
		   //step2=create object of the chromedriver class by providing reference of webdriver
	   WebDriver driver=new ChromeDriver();     //upasting
	   
	   //enter url
	   driver.get("https://demo.guru99.com/insurance/v1/index.php");
	   
	   driver.manage().window().maximize();
	   
	   //wait
	   Thread.sleep(2000);
	   
	   //to read data from Excelsheet
	   FileInputStream file= new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
	   
	   Sheet Sh= WorkbookFactory.create(file).getSheet("Sheet5");
	   
	   //enter email
		String Email=Sh.getRow(0).getCell(0).getStringCellValue();
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
	  
	  //wait 
	  Thread.sleep(2000);
	  
	  //enter password
	  String Password=Sh.getRow(1).getCell(0).getStringCellValue();
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	  
	  //wait
	  Thread.sleep(2000);
	  
	  //click login button
	  driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	  
	  //wait
	  Thread.sleep(2000);
	  
	  //to verify email
	  String ExpectedResult=Sh.getRow(2).getCell(0).getStringCellValue();
	  WebElement S1=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
	  
	   String ActualResult=S1.getText();
	   
	   if(ExpectedResult.equals(ActualResult))
			   {
		   System.out.println("pass");
			   }
	   else
	   {
		   System.out.println("fail");
	   }
	   
	   //wait
	   Thread.sleep(2000);
	   driver.close();
	}

}
