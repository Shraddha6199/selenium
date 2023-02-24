package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//to reach upto excelsheet
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		String Value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(Value);                 //army
		
		
	}

}
