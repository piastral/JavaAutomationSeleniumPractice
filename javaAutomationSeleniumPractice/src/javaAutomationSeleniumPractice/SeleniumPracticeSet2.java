package javaAutomationSeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPracticeSet2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		// WebElement passTextBox = driver.findElement(By.id("pass"));
		WebElement rub = driver.findElement(By.id("month"));
		WebElement rub1 = driver.findElement(By.id("day"));
		WebElement rub2 = driver.findElement(By.id("year"));

		rub.click();rub.sendKeys("Nov");Thread.sleep(2000);rub.click();
		rub1.click();rub1.sendKeys("2");Thread.sleep(2000);rub1.click();
		rub2.click();rub2.sendKeys("1990");Thread.sleep(2000);rub2.click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
}	
	
		
		
		
		
		

	

