package testNgFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListoFAnnotationsTestNg {
	/*Annotations :: annotations are nothing but predefine classes which contains reusable code
	 * every annotations starst with @ symbol
	 * 1-@beforeSuite
	 * 2-@AfterSuite
	 * 3-@before Test
	 * 4-@AfterTest
	 * 5-@BeforeClass
	 * 6-@AfterClass
	 * 7-@BeforeMethod
	 * 8-@AfterMethod
	 * 9-@Test
	 * 10-@Ignore
	 * 
	 * 
	 * we will use in company or organization the 
	 * emailable-report.html with higher authority
	 * 
	 */
	//lets use first annotations ::
	@Test
	public void ts1() {
		System.out.println("this is test scenario 1");
	}
	@Test
	public void ts2() {
		System.out.println("this is test scenario 2");
	}
	
	@Test
	public void ts3() {
		System.out.println("this is test scenario 3");
	}
	//it will print before executing the test case 
	//and if there is multiple test case in one class it will print 
	//before every test cases 
	@BeforeMethod
	public void beforeMehtod() {
		System.out.println("before method ::hierarchy 4");
	}
	
	//it will print after executing the test case
	@AfterMethod 
	public void afterMethod() {
		System.out.println("after method ::hierarchy 5 ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class ::hierarchy 3");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class hierarchy 6");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test :hierarchy 2");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test hierarchy 7");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before suite :hierarchy 1(parent)first");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite hiearchry 8(last) ");
	}

}
