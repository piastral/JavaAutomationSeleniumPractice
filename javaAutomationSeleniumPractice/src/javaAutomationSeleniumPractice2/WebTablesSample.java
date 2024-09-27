package javaAutomationSeleniumPractice2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesSample {
	// getting the data from table individually in column matter 
	// to get single value if its is shareprice the price will go up and down 
	//to handle single value  in webtable we will use row and column individual value 
	/*for example ::: //table[@class='dataTable'] //tr[3]td[2] mean in row 3 and coulmn 2 with data choose #2
	 * 
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		List<WebElement> sharePrice= driver.findElements(By.xpath("//table[@class='dataTable']//td[3]"));
		
	 
	  for(WebElement data : sharePrice) {
		  System.out.println("The Price of Every Share for Each company ::"+data.getText());
	   }
	  driver.close();

}
}