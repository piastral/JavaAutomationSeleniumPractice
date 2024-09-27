package javaAutomationSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSeleniumDropDown {
	/*
	 * Select is class provided by selenium that is used to work with dropdown
	 * element. the select class allows us to slect an element from the drop down
	 * and list that are created with html <select> element select class is present
	 * in org.openqa.selenium.support.ui.package .it extends object class and
	 * implements iSelect interface since the select is ordinary class ,its ob ject
	 * is created by using the new keywork after creation object we will pass the
	 * dropdown webelems as parameter to its constructor syntax::Select ob = new
	 * Select(WebElement element); To handle select class we will use 3 method
	 * 
	 * 1-selectByValue()::this method is used to select an option by passing a value
	 * associated with the value attribute . for example:in the previous county list
	 * if we selectByValue("AR") argentina will be select 2-
	 * 
	 *  selectByIndex:: this
	 * method is used to select an option from dropdown list by passing an index
	 * value the index range 0 to n-1 where n is total number of options in the list
	 * 
	 * 3-selectByVisibleText:: very easy method to choose an option from dropdown
	 * list it slect an option by passing the text option that we see on screem
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		
				
	    WebElement month=	driver.findElement(By.id("month"));
		WebElement day= driver.findElement(By.id("day"));
		WebElement year= driver.findElement(By.id("year"));
		
		Select obj = new Select( month);
		obj.selectByValue("11");
		
		Select obj1 = new Select(day);
		obj1.selectByValue("2");
		
		Select obj2 = new Select(year);
		obj2.selectByValue("1990");
		
		
		Thread.sleep(2000);
		driver.close();
		
		



	}

}
