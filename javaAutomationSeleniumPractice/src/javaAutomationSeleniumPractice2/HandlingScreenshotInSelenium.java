package javaAutomationSeleniumPractice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HandlingScreenshotInSelenium {
	/*
	 * we are using this options to capture screenshots in applications using
	 * webdriver according to testing principles we need to take screenshot of
	 * application for every step in test case as test evidence . in webdriver also
	 * we can take screenshot by using "TakesScreenshot" interface and
	 * getScrenshotAsMethod.once we take screenshot we can save as .png
	 * format(portable network graphics).
	 * 
	 */
	static WebDriver driver;
	public  static  void takeScreenShot() throws Exception {
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\mohammed\\Desktop\\OutputScreenshotSelenium\\fbReg.png"));
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//first c\store the screenshot in file variable and than copy to destinaiton folder
		
		//docs.oracle.com/javase/7/docs/api/
		
		
		//how to take screenshot of Webelement  element logo
   WebElement	loginShot	=driver.findElement(By.xpath("//button[@name='login']"));
   File f = loginShot.getScreenshotAs(OutputType.FILE);
   Files.copy(f, new File("C:\\Users\\mohammed\\Desktop\\OutputScreenshotSelenium\\fbLogin.png"));
		Thread.sleep(1000);
		driver.close();
		
		 takeScreenShot();
	}

}
