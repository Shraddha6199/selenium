package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class pdemo1 
{
	public static void main(String[] args) throws IOException
	{
		//to reach the upto excel sheet
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		//to oepn the excel sheet
		Workbook S1=WorkbookFactory.create(file);
		
		//to enter particular sheet
		Sheet Sh=S1.getSheet("Sheet1");
		
		//to highlight row
		
		
	}

}
