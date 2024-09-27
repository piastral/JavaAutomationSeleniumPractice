package dataDrivenFrameworkSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ImplicitWait {

	public static void main(String[] args) {
/* we are using implicit wait to stop the execution temporarily based on the availabilty of the element in app
 * syntax ::driver.manage().timeouts().implictlywait(time,Timeunit.SECONDS)
 * realtime we wil use this or webdriver wait
 * 
 * 		
 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//applying implicit wait 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
		FindByAnnotation fa = PageFactory.initElements(driver, FindByAnnotation.class);
		   fa.uid.sendKeys("shahidmasood666@yahoo.com");
		
		   fa.pwd.sendKeys("123Hajar");
		   driver.close();
	
	}

}
