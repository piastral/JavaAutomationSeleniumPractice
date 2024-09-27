package dataDrivenFrameworkSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		PageObjectByClass pob = new PageObjectByClass();
		driver.findElement(pob.uid).sendKeys("shahidmasood666@yahoo.com");
		driver.findElement(pob.pssWd).sendKeys("hajar123");
		WebElement vara=driver.findElement(pob.login);
		vara.click();
		
	}

}
