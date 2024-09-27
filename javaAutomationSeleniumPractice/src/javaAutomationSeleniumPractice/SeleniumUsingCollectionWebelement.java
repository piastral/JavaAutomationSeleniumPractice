package javaAutomationSeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUsingCollectionWebelement {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.id("email")).sendKeys("mohammed.qa@gmail.com");

		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		System.out.println(linkCount.size());
		
	//	System.out.println(linkCount.toArray());
		/*for(int i =0;i<linkCount.size();i++) {
			System.out.println(linkCount.get(i).getText()); //use ctrl+shift+? to comment out the code fully
		}*/
		/*
		 * for(WebElement linkName :linkCount) { System.out.println(linkName);
		 */
		 for(WebElement linkName :linkCount) {
			String link = linkName.getText();
			
			if(link.contains("book")) {
				System.out.println(link);
			
		 }
		 
		 }
	
		driver.close();
	}
	
}
