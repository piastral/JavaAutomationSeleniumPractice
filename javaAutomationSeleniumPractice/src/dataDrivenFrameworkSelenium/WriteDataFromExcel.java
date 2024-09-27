package dataDrivenFrameworkSelenium;

import java.awt.Label;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteDataFromExcel {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
      FileOutputStream fo = new FileOutputStream("C:\\Users\\mohammed\\Desktop\\Jars\\24JulyOutput.xls");
      
			WritableWorkbook ww = Workbook.createWorkbook(fo);
			WritableSheet ws = ww.createSheet("Result", 1);
			
			int a = 10 ; int b =20;
			int c=a+b;
			
			jxl.write.Label l = new jxl.write.Label(0,0,"C value is "+c);
			ws.addCell(l);
			//saving the excel and closing 
			ww.write();
			ww.close();
			

	}

}
