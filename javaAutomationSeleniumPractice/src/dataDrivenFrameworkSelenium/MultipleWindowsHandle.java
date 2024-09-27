package dataDrivenFrameworkSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* HANDLING MULTIPLE WINDOWS :: WE ARE using these options to handles  multiple windows in webdriver 
 * sometimes during run time ,we need to work on multiple (more than 1 window).in that case we need to 
 * first count number of windows using "getWindowhandles" ,method and we can work on multiple windows
 * 
 * //difference between driver.close and driver.quit 
		//driver.close() is used to close single window
		//driver.quit() is used to close all windows at a time incuding driver instance
 * 
 */

public class MultipleWindowsHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"https://pay.facebook.com/\"]")).click();
		Thread.sleep(2500);

		// now ill handle multiple windows
		Set<String> st = driver.getWindowHandles();
		System.out.println(st.size());

		for (String s : st) {
			driver.switchTo().window(s);

			Thread.sleep(1000);
			// prepare program to close only windows which title contains "Sample")
			String appTitle = driver.getTitle();
			if(appTitle.contains("Pay")) {
				System.out.println(" it contains:: "+appTitle);
			}
			driver.close();
		}
		// will close multiple windows

	}

}
