package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo7 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		int rowsize=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		System.out.println(rowsize);
		
	}

}
