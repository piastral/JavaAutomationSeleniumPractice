package javaAutomationSeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*drag and drop actions means select and move to other location of the element 
 * 
 */

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed\\Desktop\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// description :: launch the application
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		// if there frame and inside the frame we have drag and drop elements so we have handle the frame first 
		//to handle we have tu use frame method
		driver.switchTo().frame(0);//0 denotes first index and only one frame is located
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop =driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions ac = new Actions(driver);
		//1st way for drag and rop
	     ac.dragAndDrop(drag,drop ).build().perform();
		// 2nd way for drag and drop
	     ac.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		

	}

}
