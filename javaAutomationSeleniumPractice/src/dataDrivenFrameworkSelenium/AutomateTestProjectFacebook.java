package dataDrivenFrameworkSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
/*inputstream :: this is used to read sequential data from source ::
 * outputStream :: this is used to write data to destination
 * 
 */
public class AutomateTestProjectFacebook {

	public static void main(String[] args) throws BiffException, IOException, Exception {
		FileInputStream f = new FileInputStream("C:\\Users\\mohammed\\Desktop\\Jars\\24July.xls");

		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		int rc = s.getRows();// return tipe of get rows is integer
		int cl = s.getColumns();

		System.setProperty("webdriver.chrome.driver",s.getCell(1, 13).getContents() );

				
		
		WebDriver driver = new ChromeDriver();
		driver.get(s.getCell(1, 1).getContents());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement emailBox = driver.findElement(By.name("email"));
		WebElement passBox = driver.findElement(By.name("pass"));
		WebElement loginId = driver.findElement(By.name("login"));

		Thread.sleep(2000);
		String var = s.getCell(1, 9).getContents();
		emailBox.sendKeys(var);
		
		String var1 = s.getCell(1, 10).getContents();
		passBox.sendKeys(var1);
		
		loginId.click();

		
		Thread.sleep(3000);
		driver.close();

	}

}
