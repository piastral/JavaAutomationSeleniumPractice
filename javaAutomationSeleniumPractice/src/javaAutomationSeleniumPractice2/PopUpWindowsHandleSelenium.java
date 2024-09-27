package javaAutomationSeleniumPractice2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindowsHandleSelenium {
	/*
	 * we are using this option to handle alerts during exceution time in
	 * application .sometimes some alerts are interuppting applications becaue of
	 * tat we are unable to continue execution untl close the alert message if any
	 * alert comes ne need to switch focus from driver to alert using 'switch to'
	 * method by using alert interface by creatiing refrence .with the help of
	 * refernce we can handle alerts SYntax:: Alert a = driver.switchto.alert();
	 */

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement signIn = driver.findElement(By.name("proceed"));
		signIn.click();
		
		Alert a = driver.switchTo().alert();
	
		//we can check the message by usng referene variable 
		System.out.println(a.getText());
		
		//WE ARE rejecting THE ALERT AND THAN CLOSING 
		
		a.dismiss();
		Thread.sleep(1500);
		driver.close();
		
		
	}

}

/*
 * WebElement idBox=driver.findElement(By.id("login1")); WebElement passBox
 * =driver.findElement(By.id("password"));
 */

/*
 * idBox.sendKeys("Mohammed qa"); passBox.sendKeys("123456789");
 */
