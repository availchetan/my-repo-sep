package com.mycompany.app;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Resources.base;


public class CopyTest2 extends BasicTC1Test {
	public static Logger log =Logger.getLogger(base.class.getName());
	
	// Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    //    Homepage homepage = new HomePage(driver,wait);
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
 
    @Test (priority = 0, description="Invalid Login Scenario with wrong username and password.")
    public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {
        //ExtentReports Description
       // ExtentTestManager.getTest().setDescription("Invalid Login Scenario with wrong username and password.");
 
        //*************PAGE INSTANTIATIONS*************
       // HomePage homePage = new HomePage(driver,wait);
       // LoginPage loginPage = new LoginPage(driver,wait);
 
        //*************PAGE METHODS********************
        //Open N11 HomePage
        //homePage.goToN11();
 
       
 
        //*************ASSERTIONS***********************
        Thread.sleep(500);
       
    }
 
    @Test (priority = 1, description="Invalid Login Scenario with empty username and password.")
    public void invalidLoginTest_EmptyUserEmptyPassword () throws InterruptedException {
        //ExtentReports Description
        //ExtentTestManager.getTest().setDescription("Invalid Login Scenario with empty username and password.");
 
        //*************PAGE INSTANTIATIONS*************
        //HomePage homePage = new HomePage(driver,wait);
        //LoginPage loginPage = new LoginPage(driver,wait);
 
        //*************PAGE METHODS********************
        //homePage.goToN11();
        //homePage.goToLoginPage();
        //loginPage.loginToN11("","");
 
        //*************ASSERTIONS***********************
    	log.debug("I am Debugging");
		log.info("Waiting for 500 Milliseconds");
    	Thread.sleep(500);
    	System.out.println("Write steps to add your scenatio");
        //loginPage.verifyLoginUserName("Lütfen e-posta adresinizi girin.");
        //loginPage.verifyLoginPassword("WRONG MESSAGE FOR FAILURE!");
       // Assert.assertTrue(false);	
    }
 
}
