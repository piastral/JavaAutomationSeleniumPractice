package javaAutomationSeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*html frame are used to divide your browser window into multiple section where each section can load 
 * seperate html document 
 * acollection of frames in the browser window is knows as frameset 
 * 
 * the main advantage of frames is that it allows the user to view multiple documents within singe web page 
 * 
 */

public class IframeSelenium {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//lets handle the iframe 
		driver.switchTo().frame(0);
		WebElement frameHandle=driver.findElement(By.xpath("//a[@href=\"java/awt/package-frame.html\"]"));
		frameHandle.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
