package testNgFramework;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("hello i am big ");
	}
	
	@Test
	public void tScenario1() {
		System.out.println("I am The Test Case");
	}

}
