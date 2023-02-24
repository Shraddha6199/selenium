package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo8
{
	//to get size of cell
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		//to get size of cell
		int colsize =WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
		System.out.println(colsize);
		
	}

}
