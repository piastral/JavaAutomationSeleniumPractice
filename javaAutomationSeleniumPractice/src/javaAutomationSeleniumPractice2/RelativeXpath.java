package javaAutomationSeleniumPractice2;
/*Relative Xpath:::
 * 1-rleative xpath finds out the elment based on the unique locator
 * 2-for relative x path starts from the middle of the html dom structure
 * 3-it start with double forward slash(//) which means it can search the elemetn anywhere at webpage
 * 4-below the xample of relative xpath expression
 * 5- real time organization we only use relative xpath
 *  NODE/ REPRESENT ROOT NODE :: NODE// FORWARD SLASH CAN REPRESENT ANYWHERE IN HTML BODY 
 *  @=SPECIFIED THE LOCATOR IN HTML BODY
 * 
 * syntax{://Tagname[@locator='value']}
 * ex::{//input[@name='username']
 * to get relative xpath use tagname even on login whatever name is associated use that field
 * if there is long link in href in html body we can use text method() to associate with it
 * @we are using only for atrribute or locator but with no atrribute we can use text()method followed by text
 * and also when we want to find out any link or anything that linktext in xpath we can find oout by
 * the colour of that text if it is black we can use on that time text()method instead of attributes or locator
 * 
 * XPATH EXPRESSION AND LOGIC:::
 * 1- basic expression ://tagname[@locator='value']
 * 2 -AND logic : //select [@id='day' and @name='dayname']
 * 3- OR logic:://select [@id='day' or @name='dayname']
 * 4-Starts-with logic :://select [starts-with(@id,"day")]
 * 5-Contains logic :: select[contains(@id, "a")]
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) throws Exception {
		
		//RELATIVE XPATH FOR EMAIL ADDRESS::
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 Thread.sleep(1000);
		
		WebElement newAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAccount.click();
      
        driver.close();
		
		//WebElement emailBox =driver.findElement(By.xpath("//input[@id='email']"));
		//emailBox.sendKeys("shahidmasood10@gmail.com");
		
		//RELATIVE XPATH FOR PASSWORD::
	//	WebElement passBox =driver.findElement(By.xpath("//input[@id='pass']"));
		//passBox.sendKeys("habuuu");
		
		//RELATIVE XPATH FOR LOGIN::
		
		//WebElement loginCheck =driver.findElement(By.xpath("//button[@name=\"login\"]"));
		//loginCheck.click();
		//Thread.sleep(10000);
		//relative xpath for forgot password use TextMerthod
		//WebElement forPass =driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		//forPass.click();
		
		//check the logo in application
		/*
		 * WebElement logoCheck =driver.findElement(By.xpath("//img[@alt='Facebook']"));
		 * logoCheck.click(); if(logoCheck.isDisplayed()==true) {
		 * System.out.println("pass"); }else { System.out.println("fail"); }
		 * System.out.println("Our logo is "+" "+logoCheck);
		 */
		//find an xpath for create new page in face book
		
		
		
	}
		
}	
	


