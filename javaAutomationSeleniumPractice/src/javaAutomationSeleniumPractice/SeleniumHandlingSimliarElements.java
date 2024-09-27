package javaAutomationSeleniumPractice;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*working with similar multiple elements ::for identifying one element we are using "find element"
 * method based on locator of the lement .for working with multiple elements  we need to identify them by using 
 * "find elements " method .all identify elements will be stored into list<webelements> collection
 * note:: for similar elements like (buttons ,links images combo boxes ) tagname is the common locator
 * 
 * stnax ::List<WebElements> var = driver.findelements(by.tagname("value);
 * tagname are nothing but links and always it starts with "A"
 * 
 * 
 * to cross check in the applictaion go to inspect use ctrl+f and than use//a we can cross check how many links
 * are there in wherever we are veryfing
 * same  we can use  ctrl+f //img ctrl +f //buttons
 * 
 * interview question difference between findelement() and findelements();
 * ans: findelement allows to find the single element whereas findElements allows to find similar type of 
 * multiple elements for ex(images,links buttons)findElements();the return type of web elemet is web element 
 * the return type of ebelements is listof<webelement>
 * in case of findElement() we are using unique locators and case findElements we are using common locator
 * thats is tagname
 */

public class SeleniumHandlingSimliarElements {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.id("email")).sendKeys("mohammed.qa@gmail.com");

		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		System.out.println(linkCount.size());
		List<WebElement> but = driver.findElements(By.tagName("button"));
		System.out.println("the number of buttons present is " + but.size());

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("number of images is " + images.size());

		if (linkCount.size() > images.size() == true) {
			System.out.println(
					"number of links is " + linkCount.size() + " is more than number of images " + images.size());
		} else {
			System.out.println(
					"Number of links is " + linkCount.size() + " is less than number of images " + images.size());
		}
		
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
