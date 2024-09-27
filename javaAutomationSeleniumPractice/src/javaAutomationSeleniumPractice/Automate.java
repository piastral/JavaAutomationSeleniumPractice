package javaAutomationSeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		//creating interface and implementing class 
		// here interface is web driver and clas is chromedriver
		WebDriver driver = new ChromeDriver();
		//2nd step jvm will see driver wants to open this website 
		driver.get("https://www.facebook.com/");
		//3rd step lets maximasize the website
		driver.manage().window().maximize();
	  // 4th step it will wait for sometime , it will open and than it will wait
		
		//5th step it waits and than close the website
		driver.close();
		Thread.sleep(4000);
		
		// dont write full sentence use one word and use ctrl+space eclipse gives you info what you need
		
		

	}

}
