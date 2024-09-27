package dataDrivenFrameworkSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException, Exception {
		//Importing fileInputStream class to identify location of excelsheet
		FileInputStream f= new FileInputStream("C:\\Users\\mohammed\\Desktop\\Jars\\24July.xls");
		//opening identifyied workbook
		
		Workbook wb = Workbook.getWorkbook(f);
		//opening the sheet in opened workbook so we are importing sheet interface but we are not creating object
		//of sheet because sheet is interface and the method which is there inside sheet is abstract
		Sheet s = wb.getSheet("Sheet1");
		//vvimp whenever we right a data in excel sheet and we are importing those data for testing purpose
		//always we need to save each and every time other wise if we print those data will not be shown
		
		//we can use get rows method to check the length and not change the structure of loop evertime when 
	   // i am adding values
		int rc = s.getRows();//return tipe of get rows is integer
		int cl = s.getColumns();
		
		for(int i =0 ;i<=1 ;i++) 
		{
			
			for(int j =0 ;j<rc ;j++)
			{
				System.out.println(s.getCell(i, j).getContents());
			}
			
			System.out.println();
			break; 
		}
		for(int i =0;i<cl;i++ ) {
			System.out.println(s.getCell(i, 0).getContents());
		}
			
		
	}

}
