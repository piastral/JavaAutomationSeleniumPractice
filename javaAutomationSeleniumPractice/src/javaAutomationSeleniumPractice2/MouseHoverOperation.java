package javaAutomationSeleniumPractice2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*with the help of ACTION CLASS WE CAN handle MOuse hover operation::
 * we are using actions class to perform miscellanous operations like mouse movements ,sendkeys ,double click
 * drag and drop ,clickandhold etc...00
 * syntax :: Actions obj = new Actions(WebDriver Driver)
 * sending keyboard operations using actions we are using actions also for sending keyboard operations
 * to the application.
 * actions class is present in org.openqa.selenium.interactions.Actions;
 * 
 */
public class MouseHoverOperation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// description :: launch the application
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
	  WebElement clik=driver.findElement(By.xpath("//a[@href=\"java/awt/package-frame.html\"]"));
		clik.click();
	
		
		
		

	}

}
