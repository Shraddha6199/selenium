package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo3
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//to reach upto excelsheet
		FileInputStream file=new FileInputStream("\\C:\\java\\parameterization\\demo.xlsx\\");
		
		String Data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(Data);              //jungkook
		
		
	

  }
}

