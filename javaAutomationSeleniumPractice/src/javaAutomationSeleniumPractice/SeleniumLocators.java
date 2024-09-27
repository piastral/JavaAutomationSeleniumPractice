package javaAutomationSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	/* 
	 * element locator: locator are nothing but the identifications of the elements
	 * in the application.since every product in the world is having some
	 * identification ,i the same way every element in the application also
	 * havingsome identificationthe identification we can call locators or
	 * attributes there are 7 type of locators we have 1-ID 2-Name 3-Class 4-TagName
	 * 5-xpath 6-linktext 7-Css how webdriver will identify elemnts? answebdriver
	 * will identify the elements in the application based on the lcators by
	 * using"findElements"method Syntax:: driver.FindElement(by.locator("value");
	 * note: we always prefer unique locators to identify the elements
	 */

	
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mohammed.qa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mohammed@123");
		// driver.findElement(By.name("login")).click();

		// driver.findElement(By.name("pass")).clear();
		Thread.sleep(4000);

		boolean emailDisplay = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(emailDisplay);
		Thread.sleep(1000);

		boolean passDisplay = driver.findElement(By.id("pass")).isDisplayed();
		System.out.println(passDisplay);
		Thread.sleep(2000);

		boolean emailEnable = driver.findElement(By.id("email")).isEnabled();
		boolean passEnable = driver.findElement(By.id("pass")).isEnabled();

		if (emailEnable == true && passEnable == true) {
			System.out.println("the elements is enabled " + "PASS");
		} else {
			System.out.println("FAIL");
		}
		String appTitle = driver.getTitle();
		System.out.println(appTitle);
		// to check the url of the app
		String appUrl = driver.getCurrentUrl();
		System.out.println(appUrl);

		// to capture tje locator value of the element from the application
		String att = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(att);
		Thread.sleep(1000);
		String tag = driver.findElement(By.name("login")).getTagName();
		System.out.println("this is tagName method " + tag); // return type string
		
		System.out.println(driver.findElement(By.name("login")).getSize()); // return type is dimension xand y
		
		String text = driver.findElement(By.name("login")).getText();
		System.out.println(text);
		
		
		String appTitle1 = driver.getCurrentUrl();
		String a = "abcd";
		
		if(appTitle1.equals(a.contains("abcd"))) {
			System.out.println(appTitle + "   pass because it contains abcd ");
		}else {
			System.out.println("FAIl IT DOESNT CONTAIN ABCD");
		}
		driver.close();
		
		
		
		
		
		
		

		

		/*
		 * Validation commands in webdriver:: we are using these command to perform
		 * validation in webdriver isDisplayed(): ::-to verify wheather the element is
		 * displaying in the application or not
		 * syntax;;driver.findelement(by.id("locator value").isDisplayed();
		 * 
		 * isEnabled(): ::-to verify wheather the element is enabled in the application
		 * or not syntax;;driver.findelement(by.id("locator value").isEnabled();
		 * 
		 * isSelected(): ::-to verify wheather the checkbox/radiobutton selected or not
		 * syntax;;driver.findelement(by.id("locator value").isSelected();
		 * 
		 * VALIDATION COMMANDS IN WEBDRIVER getAttribute(): to capture the locator value
		 * of the element from the application
		 * 
		 * getTagName(): to capture the html tag name of the element getSize(): to
		 * capture the size of the element getText(): to capture the name of the element
		 * question??
		 * 1-how can we verify the availabilty oif element ??
		 * ans - with the help of displayed method
		 * 2-write a program to verify application title should contains "abcd"
		 * 
		 * 
		 * 
		 */

	}

}
