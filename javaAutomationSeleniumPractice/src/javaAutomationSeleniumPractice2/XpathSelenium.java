package javaAutomationSeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*what is Xpath -> 1-xpath is defined ans xml path :
 * 2- xpath is unique locator of the element in application like 7 other unique locators(id,name,class,linktext...)
 * 3-xpath is syntax or language for finding any element on the web page using xml path expresion 
 * 4- xpath is used to find out the location of element on webpage using html dom structute 
 * 5-whenever we cant use id or name or link we have to use xpath 
 * 
 * different type of XPATH:
 * 1-absolute Xpath:::1-identify the exact location of the elemtn in html page from html tag till elment 
 * 2)-- it begins with forward slash (/) which means ypu can select element from root node:
 * 3)- below the example of absolute xpath expression of the elemnt
 * ---/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]div/div[1]/form/div[1]/div[1]-----
 * 
 * {for facebook to search Xpath locator for email id we will use :: first inspect than select email than do 
 * right click on mouse copy the FULLxpath and than use ctrl +f and ctrl +v it will copy the full xpath using xml
 * expression }
 * 
 * FACEBOOK EMAIL ID XPATH LOCATOR:::
 * {/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input}
 * 
 * FACEBOOK PASSSWORD ID XPATH LOCATOR:::
 * {/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input}
 * 
 *  FACEBOOK lOGIN ID XPATH LOCATOR:::
 * {/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button}
 * 
 *  FACEBOOK FORGET PASSWORD? ID XPATH LOCATOR:::
 *  {/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a}
 * 
 * 2--	in real time we will not use absolute Xpath we will only use relative xpath
 *why we will not use absoluter Xpath ??
 *ans: because element location might chnage depends upon customer requirment in that case using xpath we will 
 *not be able to find that particular elment so thatst why use relative path
 *it looks so lengthy 
 *performance wise it will be slow because we are using from root node
 * 
 * 
 */

public class XpathSelenium {
	public static void main(String[] args) throws Exception {

		// FACEBOOK EMAIL ID XPATH LOCATOR:::
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement emailBox = driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		emailBox.sendKeys("shahidmasood666@yahoo.com");
	
		//FACEBOOK PASSSWORD ID XPATH LOCATOR
		WebElement passBox= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		passBox.sendKeys("PaglaChulkeNe2");
		
		// FACEBOOK lOGIN ID XPATH LOCATOR
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
        
		// FACEBOOK FORGET PASSWORD? ID XPATH LOCATOR:::
		WebElement passForget=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a"));
		passForget.click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
