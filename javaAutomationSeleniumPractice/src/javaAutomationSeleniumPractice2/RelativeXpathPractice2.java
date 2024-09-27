package javaAutomationSeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathPractice2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// AND logic : //select [@id='day' && @name='dayname']
		WebElement emailBox = driver.findElement(By.xpath("//*[@id='email' and @name='email']"));

		emailBox.sendKeys("chumma");
		Thread.sleep(1000);
		driver.close();

	}

}
