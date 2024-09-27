package dataDrivenFrameworkSelenium;
/*@findby :: in this we are creating objects with @findby.we can use these objects in another class by using 
 * PAGEFACTORY METHOD ...in real world organization we used this findby annotation methodolgy for 
 * creating pasge object model
 * 
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindByAnnotation {
//ill store ALL THE elemetns byfind by annotations 
	
	@FindBy(id="email") WebElement uid;
	@FindBy(id="pass") WebElement pwd;
	@FindBy(name="login") WebElement login;
	
}
