package com.test;

import static org.testng.Assert.assertEquals;

import org.apache.hc.core5.reactor.Command.Priority;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Baseclass;
import com.pages.Homepage;

public class Testhrmpage extends Baseclass {

	 Homepage homepage = new Homepage(driver);

	@BeforeClass
	private void Openbrowser() {

		browserLanuch("https://www.orangehrm.com/en");

	}

	@Test (priority = 1)
	private void Verify_all_Headers() {
		homepage.Verify_headers();
	}

	@Test (priority = 2)
	private void Email() {
		homepage.Email_Home_Page();
		String title = driver.getCurrentUrl();
		System.out.println(title);
	}

	@Test (priority = 3)
	private void Verify_URL() {
		homepage.Verify_URL();
		System.out.println("Page URL Verified");
	}

	@Test (priority = 4)
	private void Verify_Error_Message() {
		homepage.Verify_Error_Message();

	}
	@AfterClass
	private void Browserclose() {
        Closebrowser();
	}
}
