package javaAutomationSeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndRightClick {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys("shahidmasood6000");
		Actions ac = new Actions(driver);
		//it will double click on the value 
		ac.doubleClick(emailBox).build().perform();
		//it will click right 
		ac.contextClick(emailBox).build().perform();
		Thread.sleep(1000);

	}

}
