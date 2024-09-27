package javaAutomationSeleniumPractice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkFrames {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// lets handle the iframe
		driver.switchTo().frame(0);
		
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		System.out.println(linkCount.size());
		
		for (WebElement linkCheck : linkCount) {
			
			String link =linkCheck.getText();
			if(link.contains("xml")) {
				System.out.println(link);
		
			
			}
			
			
		}
		
			
			
		Thread.sleep(2000);
		driver.close();
	}

}
