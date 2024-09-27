package javaAutomationSeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Css ::-Cascading Sheet Style is one for the locator ins selenium 
 * Syntax::TagName[Locator='value']
 * difference bewteen css and xpath ?? with xpath especially relative xpath we find the element wiht the text()
 * method.but with the css we have to use only unique locators text method is not available
 * starts wtith method,,contains method is not avaialable on css but only available on relative xpath
 * but compare to x path css is more faster
 * wild/special character in css (^ ,$,*) 
 * 
 * '^' cap we are using to check string that means any locator  is starting  input [name^='e'] does itendwith e
 * '$' dollar symbol we are using for any name or id  or locatr end with input[ID$ ='p'] does it end with p
 * '*' star symbol we arre using to check any locator contains input[id*='s'] does it contain s or not
 * 
 */

public class CSSselector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// description :: launch the application
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement cssSelectEmail = driver.findElement(By.cssSelector("input[id='email']"));
		WebElement cssSelectPass = driver.findElement(By.cssSelector("input[id='pass']"));
		WebElement cssSelectlogin = driver.findElement(By.cssSelector("button[name='login']"));
		cssSelectEmail.sendKeys("shahid");
		cssSelectPass.sendKeys("jabubu");
		cssSelectlogin.click();
		Thread.sleep(1500);

	}

}
