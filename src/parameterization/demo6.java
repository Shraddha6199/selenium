package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo6
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		int rowindex=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(rowindex);
		
	}

}
