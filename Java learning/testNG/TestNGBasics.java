package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/*
@Beforesuite - Setup properties of chrome
@Beforetest - launch browser
@Beforeclass - Enter url
@Beforemethod -login to app
@Test		  - Test case1 - Google title test
@Aftermethod - Logout from app
@Afterclass - close browser
@Aftertest - delete all cookies
@Aftersuite 


*/

public class TestNGBasics {
	
	 @BeforeSuite
	 
	 public void setup() {
		 System.out.println("Before suite----Setup system property for chrome");
	 }
	
	
    @BeforeTest
    
    public void launchbroser() {
    	System.out.println("Before test----launch browser");
    }
    
    @BeforeClass
    
    public void enterUrl() {
    	System.out.println("Before class---enter url");
    }

    @BeforeMethod
    
    public void login() {
    	
    	System.out.println("Before method----login");
    }
		
    @Test
    public void GoogleTitleTest() {
    	
    	System.out.println(" testcase1----Google title test");
    }
    
    @Test
    public void SearchTest() {
    	System.out.println(" testcase2----search test");
    }
    
    @AfterMethod
    
    public void logout() {
    	
    	System.out.println("AfterMethod---Logout from app");
    }
    
    @AfterClass
    
    public void closeBroser() {
    	System.out.println("Afterclass--close browser");
    }
    
    @AfterTest
    
    public void deleteAllCookies() {
    	
    	System.out.println("AfterTest---delteallcookiesp");
    }
    
    
}
