package dataDrivenFrameworkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdDWait {

	public static void main(String[] args) {
		/*
		 * Webdriver wait :: we are using webdriver to halt the execution temporarily
		 * based on behaviour/avaialbilty of the element in the application Webdriver
		 * wait is nothinig but predefined class in selenium so we have to create the
		 * reference of the webdriver wait
		 * 
		 * what is default time range of selenium :: answer 500 millisecons so basically
		 * with webdriver wait we can check the condition that are applicable in the
		 * elemetn s for example we can check the condition for links against password
		 * it is also called fluent wait
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();

		// APPLYING WEBDRIVER WAIT
		WebDriverWait dWait = new WebDriverWait(driver, 5);

		 driver.findElement(By.name("email")).sendKeys("shaihdmasood6@yahooo.com");
		

		dWait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("a"), 49));
		dWait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("buttons"), 0));
		
		//i have doubt on attribute contains method onfuent wait because i want to know the second parameter 
		//which is none other than string attribute 
	   // dWait.until(ExpectedConditions.attributeContains(null, null, null));
		driver.findElement(By.name("pass")).sendKeys("123Hajar");

		driver.close();

	}

}
