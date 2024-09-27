package javaAutomationSeleniumPractice;

public class SeleniumConcept {
/*What is Selenium?-selenium is the functional testing tools(regression tools) whihc is used to automate functional and 
 * regression test case scenarios
 * is one of the most widely used open source web ui automation testing suite.that supports automation across different
 * browsers,platform and programming languages.
 * selenium original name(javascript functional tester)
 * selenium supports multiple language 
 * selenium becomes one community now ,nowdays we are using selenium webdriver
 * 
 * 1- selenium is the open source tool.we dont need to payu any amount 
 * 2-supports multiple browsers like forfox,opera,chrome,safari
 * 3-supports multiple platforms windows,linux mac etc
 * 4-supports multiple languages java,c++python etc
 * 5- supports mobile app/android application
 * 6- supports the built in framwork called junit&test ng
 * 7-parallel test script execution is possible in selenium with the help of selenium grid
 * -----------------------------------************************------------------------------------
 * 
 * 	Selenium doesnt support reporting ::
 * ans we can use testNg ,inbuild it is not there but dependecy is there 
 * ----------------------++++++++++++++++++++++++++++--------------------------
 * DISADVANTAGES OF SELENIUM::
 * -------------------------------------------------------
 * 1- it supports only web based application
 * 2- selenium is the combination of multiple components so sthat configuration and utilization of 
 * selenium is bit difficult 
 * 3- doesnt have inbuild reporting tools
 * 4- timout or sync issues :: lets say our application is take 5 seconds to load and than authorize
 * for payment,lets say there is so much load it might take 10 seconds more to load but sincce
 * selenium is not so much intellegent wont understand that i need to wait more than 5 second
 * so if we provide 5 secnd it will immediately fail after 6 second it doesnt undewrstand 
 * by its own that it need time more to load....but the latest browser tools is there CYPRESS
 * WHICH UNDERSTANDS this mechanism of load if it extra seconds it wil  wait
 * ---------------------------------------------------------------------------------
 * SELENIUM COMPONENTS :::--
 * -------------------------------[]
 * 1- selenium ide
 * 2- selenium Rc:- allows tester to write automated web app ui test in any of the supported programmin
 * it also involves an http proxy server which enables the browser to beleive that the web app being tested
 * comes from domain provide by proxy server
 * ::: drawbacks of rc 1- 
 * 3-selenium web driver :: to overcome drawbacks of selenium rc webdriver is launches we can use to design
 * the test scripts and execute the ts in different browsers and in diff envio..
 * 
 * slenium webdriver performs much faster compared to selenium rc because it makes direct call to the web broswer
 * .rc on the other hand needs an rc server to interact with the web browser
 * 
 * 4-selenium grid :: with selenium grid we can start our remote machine by taking hub as master 
 * for selenium and node as slave and we can set up in docker with the docker container 
 * and with the command of hub given to different nodes(chrome,firefox etc) the test execution
 * can be done paraelly in different nodes and it will take so muh less time..if 100 test cases
 * are getting executed and we have 10 nodes considereing all nodes are setup with defferent set of
 * browser from firefox to chrome brave etc.. it will take 10 minutes to run 100 test case considering
 * every test case in every node will run for 10 minutes 
 * ----------------------------------------------------------*******************-----------------------
 * SELENIUM 4 NEW FEATURES ::
 * ------------------------------------------
 * webdriver is developed by w3c standard
 * selenium ide support for chrome is abailable now
 * selenium grid :: acts very smoothly 
 * taking screenshot at the element level,section level and page level is possible now 
 * support of relative locators
 * -----------------------------------------
 */

	public static void main(String[] args) {
/*ADVANTAGES OF WEBDRIVER
 * 1-LIKE as rc we need not to start the server for web driver
 * 2-we can acess rc commands into webdriver but we cannot access webdriver commands into rc
 * 3- default sync is applicable for page loading in webdriver
 * 4-we can handle multiple similar elemnts(links,buttons,images)in webdriver
 * 5-we can handle alert messages popup indows using web driver
 * 6-we can hanlde mouse over operations in web driver
 * 7-we can handles web tables using web driver
 * 8-we can handle multiple windows
 * 		
 */

	}

}
