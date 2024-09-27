package javaAutomationSeleniumPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPracticeSet1 {
	
	/*sl number 1 ; descripton -launch facebook app ::expected result ::
	 * application title length should be greater than application url length
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//description :: launch the application
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//first lets get title using getmethod and than compare with url length
		/* String title=driver.getTitle();
		 //title should compare with url 
		 String url = driver.getCurrentUrl();
		 //lets right the logic title should be greater than url length
		 if(title.length()>url.length()) {
			 System.out.println("The title is greater " + title);
		 }else {
			 System.out.println("the title is smaller than url "+ url);
		 }
		 System.out.println("expected result passed ");
		 Thread.sleep(1000);
		 */
		
		 //description 2 : click on the log in button 
		 // log in button should be avaialavle and should be enabled
		/*driver.findElement(By.id("email")).sendKeys("mohammed.qa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mohammed@123");
		*/
		// driver.findElement(By.name("login")).click();
		 
		//login button should be avaialble and enabled 
		/*
		boolean l = driver.findElement(By.name("login")).isDisplayed();
		boolean l1 = driver.findElement(By.name("login")).isEnabled();	
		
		if(l==true&&l1==true) {
			System.out.println("the login is displayed and enabled PASS");
		}else {
			System.out.println("the login is diabled and not available FAIL");
		}
		*/
		driver.findElement(By.className("_8icz")).click();
		//return type of find element is webelement
		
		String title=driver.getTitle();
		if(title.contains("password")) {
			
			System.out.println("pass" );
		}else {
			System.out.println("fail ");
		}
		System.out.println(title);
		driver.close();
	}	
}	
				
				
		
		
	
		
		 
		 
		 
			 
		
		
	


