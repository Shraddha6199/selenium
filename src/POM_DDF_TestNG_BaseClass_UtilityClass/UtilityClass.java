package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityClass
{
	//Automation TE:@Shraddha
    //Date:15/02/2023
	//Day:Wed
	//Title:Ftech data from property file
	
	@Test
	public static String getDatafromPF(String key) throws IOException
	{
		//to reach upto property file
		FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\1_Oct_Selenium\\Propertyfile.properties");
		
		//create object of properties class
		Properties pro=new Properties();
		
		//to open Property file
		pro.load(file);
		
		//to fetch data from property file
		String data=pro.getProperty(key);            //EM=saradeg41@gmail.com         //PSW=Sai@1117
		return data;                  //saradeg41@gmail.com       Sai@1117
	}
	
	//Automation TE:@Shraddha
    //Date:16/02/2023
	//Day:Thrusady
	//Title:Ftech data from excelsheet
	
	@Test
	public static String getdataFromExcelsheet(int RowIndex, int CellIndex) throws IOException
	{
		//to reach upto excel sheet
		FileInputStream file =new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet5");
		
		String data2=Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return data2;
	}
	
	@Test
	public static void CaptureScreenshot(WebDriver driver, int TestCaseID) throws IOException
	{
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
		
		File Destination=new File("D://screenshot//."+TestCaseID+".jpg");
		FileHandler.copy(Source, Destination);
	}
}
