package dataDrivenFrameworkSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SynchronisationPart1 {
	/*
	 * synchronization meaning ARE sync between two parties or in simple words
	 * attachment between two parties SYNCHRONIZATION POINT ::
	 * 
	 * The time gap between AUTOtool and application is called sync point .during
	 * the execution .If the app is taking more time to display the elements ,tools
	 * can not be able to copntinue the execution .in that case we are giving
	 * instructions to tools to wait for some more extra time until the elements are
	 * available these instruction we are providing to the tool in three different
	 * ways ::
	 * 
	 * 1-Explicit wait 2-Implicit wait 3-WebDriver wait
	 * 
	 * Explicit wait :: we are usin explicit wait to stop the execution temporarily
	 * irrespective of the app
	 * 
	 * we are using 'thread.sleep' for explicit wait in selenium
	 * 
	 */
	public static void main(String[] args) throws Exception {
		/* explicit wait or thread.sleep for java the probolems we face and the drawbacks and how we over come 
		 * drawbacks number 1 ::
		 * 1-lets say even though the elements are being loaded we have to wait it will decrease my execution time
		 * for example we are using thread.sleep for 16 second but the elements gets loaded witin 2 seconds 
		 * that major drawback sometime it mght take more seconds 
		 * 2-whatever the action we are performing we have to explicitly give wait times 
		 * 3-it is taking time in milliseconds only suppose i want to wait for 4 hrs its not letting me do that'
		 * we dont use thread.sleep in real time organization
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(14000);
		
		FindByAnnotation fa = PageFactory.initElements(driver, FindByAnnotation.class);
	   fa.uid.sendKeys("shahidmasood666@yahoo.com");
	   Thread.sleep(2000);
	   fa.pwd.sendKeys("123Hajar");
	   Thread.sleep(2000);
	 //  fa.login.click();
	   driver.close();
	   		
	
	}
}

