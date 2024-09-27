package dataDrivenFrameworkSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class Poi1XlsHssf {

	public static void main(String[] args) throws IOException   {
	  //1step ::
		FileInputStream fo = new FileInputStream("C:\\Users\\mohammed\\Desktop\\Jars\\24July.xls");
		//vimp if apache poi doesnt work with maven repo download from official website 
		//2nd step 
		
		 HSSFWorkbook wb = new HSSFWorkbook(fo); 
			HSSFSheet sh1 = wb.getSheet("sheet1");
			
			//String cellValue = sh1.getRow(1).getCell(1).getStringCellValue();
			//System.out.println(cellValue);
		DataFormatter df = new DataFormatter();
		String s = df.formatCellValue(sh1.getRow(1).getCell(1));
		System.out.println(s);
		wb.close();
			
		
			
		
	
		
	}

}
