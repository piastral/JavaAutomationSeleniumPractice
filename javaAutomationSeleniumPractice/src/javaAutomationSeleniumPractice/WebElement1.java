package javaAutomationSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {
	/*
	 * web element :: sometimes we are working on the same element repeatdly for
	 * multiple times .in that case instead of identyfying the same element again
	 * and again for multiple times we are creating the reference for that element
	 * by using webelement so that here after we can start working on the element
	 * with the help of reference syntax Webelement refrence =
	 * driver.findelement(by.locator("value");
	 * ------------------------------------------------------------------
	 * What is the m ain difference between webdriver.findelement and web element.find element
	 * interview question??::
	 * 1-DRIVER.FINDELEMENT(): it is for finding the lement from the entire page using the given selector
	 * 2-WEBELEMENT.FINDELEMENT():: first it generates the web elment and than the child element of 
	 * the given element are searched based on the given selector
	 * [[lets say we have page in applciation that consist of form where the crediantials can be 
	 * given and submit .... and there in that form two times the same elment occurs ..
	 * we can filter it out by using web elment and than we can locate the child element 
	 * so WEBELEMNT will use the refrence to use full form and with the help of refrence 
	 * we can allocate the element we want to acheve 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passTextBox = driver.findElement(By.id("pass"));
		
		Thread.sleep(2000);
		
		
		//we are not finding elemetns we are using reference 
		emailTextBox.sendKeys("mohammedqa@gmail.com");
		passTextBox.sendKeys("jjjj");
		String att =emailTextBox.getAttribute("name");
		String tag = emailTextBox.getTagName();
		System.out.println(att);
		System.out.println(tag);
		driver.getWindowHandles();//return type is set of string 
		driver.close();
		
		
		
		
		
		
		
	}

}
