package com.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.Baseclass;
import com.locators.Locators;


public class Homepage extends Baseclass {

		
		
		Locators locators;
		
		public Homepage(WebDriver driver) {
			
	         locators = PageFactory.initElements(driver, Locators.class);
		}
		
		public void Verify_headers() { 
			
		boolean Solutions_header_displayed = locators.getHeader_Solution().isDisplayed();
		Assert.assertTrue(Solutions_header_displayed, "Solutions");
		System.out.println("Solutions Header displayed");
		
		boolean Why_OrangeHRM_header_displayed = locators.getHeader_Solution().isDisplayed();
		Assert.assertTrue(Why_OrangeHRM_header_displayed, "Solutions");
		System.out.println("Why OrangeHRM Header displayed");
		
		boolean Resources_header_displayed = locators.getHeader_Solution().isDisplayed();
		Assert.assertTrue(Resources_header_displayed, "Solutions");
		System.out.println("Resources Header displayed");
		
		boolean Company_header_displayed = locators.getHeader_Solution().isDisplayed();
		Assert.assertTrue(Company_header_displayed, "Solutions");
		System.out.println("Company Header displayed");
		}
	
		public void Email_Home_Page() {
			
			locators.getEmailId_Filed().sendKeys("marimuthu.mariappan@softsuave.com");
			locators.getFreetrail_Button().click();


		}

		public void Verify_URL() {
			   String ExpectURL ="https://www.orangehrm.com/en/30-day-free-trial";
		    	  String title = driver.getCurrentUrl();
		  		 assertEquals(ExpectURL, title);
		}
		
		
		public void Verify_Error_Message() {
			
			locators.getyour_freetrail_Button().click();
			String Actultext = locators.getError_Message().getText();
			String Expecttext= "You must supply a valid name for the trial.";
			Assert.assertEquals(Actultext, Expecttext,"Expected and Actual are not same");

		}
			
		}
		

		
		
		
		
		

