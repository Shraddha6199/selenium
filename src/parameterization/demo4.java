package parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo4
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		double value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(value);
	}

}
