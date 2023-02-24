package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo12 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		//fetch data from particular cell
		 Sheet text=WorkbookFactory.create(file).getSheet("Sheet4");
		
	int	lastrowindex= text.getLastRowNum();
	
	//take for loop for rows
	for(int i=0; i<=lastrowindex;i++)
	{
		String S1=text.getRow(i).getCell(0).getStringCellValue();
		System.out.println(S1+"   ");
	}
	
	}

}
