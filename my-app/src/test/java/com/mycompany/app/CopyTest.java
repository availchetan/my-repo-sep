package com.mycompany.app;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;



public class CopyTest extends BasicTC1Test {
	
	public static Logger log =Logger.getLogger(base.class.getName());
	
	@BeforeTest
	public void setup() throws Exception {
		
		System.out.println("Initiate browser and Login to application");
		super.checkLogin();
	}

	@Test
	public void MeaningfulName() {
			
			//Navigate from login page to your module page
		    // Create the object of class associated with the page
		
		System.out.println("Write any test steps here as u are at login page");
		System.out.println("Executing scenario one");
		log.debug("I am Debugging");
		log.info("I am Informing");
		log.error("I got an error");
		log.fatal("This is Fatal");
			
		/* "LandingPage lp = new LandingPage(driver);

			try{
				WebElement we=lp.getLogin();
				we.click();
				Thread.sleep(3000L);
				LoginPage l= new LoginPage(driver);
				we=l.getEmail();
				try{
					if(we.isEnabled()){
					we.click();}
				}catch(Exception e){
					//
				}
				// Explicit wait code we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/htm")));
				we.click();
				alertIspresent();
				getDriver().switchTo().alert().accept();
				
				objCMpage.searchTextBox.sendKeys(customerMailId);
				HandleDropDown.selectDDLByVisibletext(objCMpage.searchBy, "Email");
				objCMpage.goButton.click();
				if(objCMpage.noRecordsFoundText.isDisplayed()){
					Reporter.log("Customer xyz is deleted successfully.");}
				
			
	      catch(Exception e){
					e.printStackTrace();
					Reporter.log("Customer Deletion Failed" );
					Reporter.log("<p style='color:red'>EXCEPTION:--" + ExceptionUtils.getStackTrace(e)+"</p>");
					Assert.fail();	
				} 
	      */
           }
	
	@Test
	public void MeaningfulName2() {
			
			//Navigate from login page to your module page
		    // Create the object of class associated with the page
		
		System.out.println("Executing Scenario two");
		
	}
	
	@AfterMethod
	public void navigateHome() {
		
		System.out.println("Navigate to Home page of application and continue tests");
		
	}
	
	
	
	
	@AfterTest
	public void closeBrowser() throws Exception {
		
		System.out.println("Close ur browser only as we are running parallely");
		super.closeWindow();
	}
	
	

	}

