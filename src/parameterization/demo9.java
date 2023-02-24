package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo9
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("\\java\\parameterization\\demo.xlsx\\");
		
		//to get last index of cell
		int colvalue=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum()-1;
		System.out.println(colvalue);
		
	}

}
