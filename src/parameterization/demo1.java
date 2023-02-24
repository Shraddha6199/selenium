package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo1 
{
	public static void main(String[] args) throws IOException 
	{
		//to reach upto excel sheet
		FileInputStream file =new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		//to open the excel sheet
		Workbook S1=WorkbookFactory.create(file);
		
		//to enter particular sheet
		Sheet Sh=S1.getSheet("Sheet1");
		
		//to highlight row
		Row R=Sh.getRow(0);
		
		//to highlight cell/column
		Cell C=R.getCell(0);
		
		//to fetch the data
		String Data=C.getStringCellValue();
		System.out.println(Data);
		
		
		
		
		
		
		
		
	}

}
