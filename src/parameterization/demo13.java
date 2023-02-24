package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo13 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		//to fetch all the data from sheet
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastrowindex=Sh.getLastRowNum();
		
		//outer loops for rows
		for(int i=0;  i<=lastrowindex;  i++)
		{
			int lastcellindex=Sh.getRow(i).getLastCellNum()-1;
			
			//inner loop for cell
	for(int a=0;a<=lastcellindex; a++)
	{
		String Value=Sh.getRow(i).getCell(a).getStringCellValue();
		System.out.print(Value+"  ");
	}
	  System.out.println();
		}

}
}
