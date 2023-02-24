package parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo10
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		//to read numeric value as string
		String info=WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(0).getStringCellValue();
		System.out.println(info);
		
	}

}
