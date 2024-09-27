package javaAutomationSeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathPractice1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        WebElement passBox=driver.findElement(By.xpath("//input[@name='passcode1']"));
        passBox.sendKeys("chumma");
		
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		  Thread.sleep(1000);
		WebElement emailBox=driver.findElement(By.xpath("//input[@name='onlineId1']"));
		 emailBox.sendKeys("moham123");
        WebElement saveId=driver.findElement(By.xpath("//input[@name='saveOnlineId']"));
        saveId.click();
        
        WebElement login =driver.findElement(By.xpath("//button[@id='signIn'] "));
        login.click();
        
        driver.navigate().back();
        
        WebElement forIdPass =driver.findElement(By.xpath(" //a[text()='Forgot ID/Password?'] "));
        forIdPass.click();
        driver.navigate().back();
        
        WebElement securityHelp =driver.findElement(By.xpath(" //a[@id='security'] "));
        securityHelp.click();
        Thread.sleep(1000);
        WebElement canSecutiy =driver.findElement(By.xpath("//button[@class=\"spa-card__dismissible spa-icon icon-close  spa-ui-layer-close\"]"));
        canSecutiy.click();
        WebElement enroll =driver.findElement(By.xpath(" //a[@id='enroll']"));
        enroll.click();
        Thread.sleep(1000);
        driver.navigate().back();
              
        WebElement openAcc=driver.findElement(By.xpath("//a[@id='open']"));
        openAcc.click();
        driver.navigate().back();
        
        WebElement secApp=driver.findElement(By.xpath(" //a[@id='apptScheduler'] "));
         secApp.click();
         driver.navigate().back();
        Thread.sleep(3000);
        driver.close();
        

       
        
	}

}
