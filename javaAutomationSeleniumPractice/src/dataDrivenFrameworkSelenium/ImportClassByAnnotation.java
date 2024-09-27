package dataDrivenFrameworkSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
/*in real time we are creating one page object class for one page .in case there are 10 pages in applciation
 * in that case we need to create 10 page object classes to avoid confusion while using objects
 * for example : we are page object for homepage ::: page obejct for login page
 * page object for search page 
 * page object model is design pattern not a framework
 * 
 * what are the advantages using pagefactory  ??
 * ans ::its is optimized version of page object  model for webdriver that seperated test cases and object repo
 * PAGE FACTORYcan have several advatage :include ::redcued code;improved code readibilty improved test
 *  mainataince
 * reduced code duplication
 * reusabilty of test code
 * 
 * 
 */

public class ImportClassByAnnotation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//this is how we will create refrence by using PageFactoory Method
		FindByAnnotation fa = PageFactory.initElements(driver, FindByAnnotation.class);
	    WebElement emailBox =fa.uid;
	    emailBox.sendKeys("shahidmasood666@yahoo.com");
	    fa.pwd.sendKeys("hajar1230");
	    fa.login.click();
	    Thread.sleep(2000);
	    
	}

}
