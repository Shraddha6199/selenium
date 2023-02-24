package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo5
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		boolean value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		System.out.println(value);
	}

}
