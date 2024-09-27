package javaAutomationSeleniumPractice2;

import org.openqa.selenium.By;
/*in organization they will give you kt(knowledge transfer) in real time we are perfoming validation thru
 * with the help of reusable method in web driver 
 * they wil give framework training 
 * 
 */

public class MethodCalling extends BaseClassReusableMethod {

	public static void main(String[] args)  {
	
		 MethodCalling mc = new  MethodCalling ();
		
		 mc.launchApp("https://www.facebook.com/");
		 mc.isAvaail("email",true);
		 mc.elemntEnabled("pass",true);
		 mc.getTitles("Facebook - log in or sign up",true);
		 mc.containsUrl(".com", true);
		 mc.closeApp();
		 
	     
		
	}

}
