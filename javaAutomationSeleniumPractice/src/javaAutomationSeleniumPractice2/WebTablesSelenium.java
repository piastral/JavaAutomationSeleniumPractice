package javaAutomationSeleniumPractice2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*webtables :: handling webtables inselenium web driver :: a web table in selenium is web welement used for
 * tabular representation of data the data displayed can be either static or dynamic webtables and its elemewnts
 * can be accessed using webeleemtn fuctions and locators in selenium typical example will be 
 * product specification displayed on ecommere application
 * FAQ::=how to read specific cell value from webtable
 * ans::first we will get the value with the xpath with with the gettext() we will retrieve the value 
 * to retive multiple value we will use foreach loop
 * 
 * 3-how to count number of rows in table
 * ans::tr.size()we can count
 * 4-how to read all rows value from first column in table
 * ans::with the help of for each loop we can use it 
 * 
 * Structure of web table in html page 
 * tr:: table row
 * 		tbody: table body
 *               TH :Table header/Table column 
 *               th
 *               th
 *               th
 *            tr
 *               td :: TABLE DATA
 * 
 */
public class WebTablesSelenium {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		WebElement webTables = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody"));
        
		Thread.sleep(2000);
		// number of column we will find
		List<WebElement> tableColumn = driver.findElements(By.tagName("th"));
		for(WebElement column :tableColumn) {
			System.out.println("The column are :"+column.getText());
		}
		// number of row we will find
		List<WebElement> tableRow = webTables.findElements(By.tagName("tr"));
		for(WebElement row :tableRow) {
			System.out.println("The rows are :"+row.getText());
		}

		System.out.println("Th Table has " + tableColumn.size() + " Column. ");
		System.out.println("The table has " + tableRow.size() + " Row. ");

		
		

		// finding particular data inside web tables
		WebElement singleData = driver
				.findElement(By.xpath("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody/tr[6]/td[1]/a "));
		System.out.println(singleData.getText());
		
	  String data=webTables.findElement(By.xpath("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody/tr[8]/td[3]")).getText();
	    System.out.println(data);
	  
	 
	  List<WebElement>tHeader= driver.findElements(By.tagName("th"));
	 for(WebElement header :tHeader) {
		 System.out.println("name of header is "+header.getText());
	}
	 //finding the element in the tables vertically
	 List<WebElement> linkCount = webTables.findElements(By.tagName("td"));
	 
	for(WebElement linkCheck : linkCount) {
			System.out.println("The banks which participate are ::" +linkCheck.getText());
	}
		Thread.sleep(1000);
		driver.close();
		
		

	}
}
