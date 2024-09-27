package javaAutomationSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNavigationCommand {
	/*
	 * navigation command with example when we want to navigate our webpage backward
	 * and forward or refresh we will use this nav commands 1-navigate().back()-no
	 * parameters and take back the user to the previous webpage in broswer history;
	 * 
	 * 2-navigate().forward() - navigate to next page with refrence to browser
	 * history
	 * 
	 * 3- navigate().refresh()-this command lets you refres the current webpage by
	 * reloading all erb elements
	 * 
	 * 4-navigate().to() used to launch new web broswer window and navigate to
	 * specified url
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		
		// description :: launch the application

		// driver.findElement(By.linkText("Sign Up")).click();
		// driver.navigate().forward();

		/*
		 * Thread.sleep(1000); driver.navigate().back(); Thread.sleep(2000);
		 * driver.navigate().forward(); Thread.sleep(1000); driver.navigate().back();
		 */
		//write a test script to find out speed og your internet
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.fast.com/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		WebElement speed = driver.findElement(By.id("speed-value"));
		WebElement speedUnit = driver.findElement(By.id("speed-units"));
		System.out.println("internet speed is "+speed.getText()+" "+speedUnit.getText());

		driver.close();

	}	
}
	


