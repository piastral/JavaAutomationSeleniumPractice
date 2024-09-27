package javaAutomationSeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassReusableMethod {
	// creating one method to launch an application
	// we will create instance variable so that all method we can acess to instance
	// and use
	public WebDriver driver;

	public void launchApp(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
	}
  
	// 2nd method ill use to close the application
	public void closeApp() {

		driver.close();
	}

	public void isAvaail(String loc, boolean expR) {

		boolean b = driver.findElement(By.id(loc)).isDisplayed();
		if (b == expR) {
			System.out.println("element  is displayed");
		} else {
			System.out.println("element is not there");
		}

	}

	public void elemntEnabled(String loc, boolean expResult) {

		boolean elementEnabled = driver.findElement(By.id(loc)).isEnabled();
		if (elementEnabled == expResult) {
			System.out.println("element is enabled");
		} else {
			System.out.println("element is not there");
		}
	}

	public void getTitles(String tit, boolean expCheck) {
		String Title = driver.getTitle();
		if (Title.contains(tit) == expCheck) {
			System.out.println("Title is there ::" + Title);
		} else {
			System.out.println("Title is not there ::" + Title);
		}
	}

	public void containsUrl(String ur, boolean expCheck) {
		String url = driver.getCurrentUrl();
		if (url.contains(ur) == expCheck) {
			System.out.println("url contains"+ " "+ur+"  "+"pass");
		} else {
			System.out.println("url contains"+" " +ur+" " +"failed");
		}
		System.out.println("Url is " + url);
	}

}
