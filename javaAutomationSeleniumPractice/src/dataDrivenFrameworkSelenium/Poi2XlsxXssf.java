package dataDrivenFrameworkSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi2XlsxXssf {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C:\\Users\\mohammed\\Desktop\\Jars\\poi1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet s1 = wb.getSheet("Sheet1");
		
		DataFormatter df = new DataFormatter();
		String s = df.formatCellValue(s1.getRow(2).getCell(1)); // for column we call in  poi getcell method
		System.out.println(s);
		wb.close();
	}

}
