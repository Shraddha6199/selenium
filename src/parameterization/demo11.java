package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo11 
{
	public static void main(String[] args) throws IOException {
		
		//to fetch data of particular row
		
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		 Sheet text=WorkbookFactory.create(file).getSheet("Sheet4");
		 
		  int lastcellindex =text.getRow(0).getLastCellNum()-1;
		  
		  //take loop for cell
		                             //0<=2
		                             //1<=2   
		                              // 2<=2
		                               //3<=2    ===out of loop
		  for(int i=0;   i<=lastcellindex;   i++)
		  {                                          //0                0
			                                          //0                1
			                                         //0                 2
			 String S1= text.getRow(0).getCell(i).getStringCellValue();
			 System.out.print(S1+"   "  );            //lisa     pink     lisa
		  }
		
		
	}

}
