package dataDrivenFrameworkSelenium;

public class PageObjectModelConcept {
/*Sometimes we need to work on the same element for multiple times (For both Business operations and Validations)
 * In that case we need to identify the same elements again and again manualy . in that case instead of identify
 * the elements manually by every team member ,one senior resource in a project will be involving to identity
 * the elements with unique locators and the rest of th team members can access the objects whenevr they
 * required 
 * page object model is also defined as design  testing technique we can use 
 * 
 * page object model we can implement in two ways ::
 * 1- by using by class
 * 2- by using @findBy(Accesing thru Page Factory Method)
 *  note :: in real time we are handling page objects with pagefactory method only.
 *  
 *  Byclass(Not Prefferd real time)
 *  by calss :in this method we are creating objects with BYclass .by importing class into another class 
 *  we can access those objects
 *-------------------------------***************************--------------------------
 *WHAT IS THE DIFFERENCE BETWEEN PAGE OBJECT MODEL AND PAGE FACTORY ?
 *-----------------------------------------------------------------------------
 *ANS: PAGE OBJECT MODER POM=  is selenium design pattern ,we can see it as a repository
 *where we store all the webselements,
 *this design pattern is becomin more poular in industry these days 
 *becauses its very easy to manage ,
 *we can achieve code re-usabilty 
 *and also elminates duplicate code 
 *
 *key benefits if UI CHANGES in the future then we can update webelements to page classes in POM
 *or Object repository accordingly 
 *-----------------------------------------------------------------------------------
 * 	pAGE FACTORY ::: is an integrated concept here in this we follow same principal by storing all 
 * web element in repository by using class 
 * here we use @FINDBY TO FIND THE ELEMENTS TO INITILIZE WEBELEMENT USING initELEMENT PROCESS
 * ---------------------------------------------------------
 * 
 * 
 */

}
