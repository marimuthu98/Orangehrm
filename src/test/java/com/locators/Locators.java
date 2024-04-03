package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Locators extends Baseclass {

	@FindBy(xpath = "//a[text() ='Solutions']")
	private WebElement Header_Solution;

	@FindBy(xpath = "//a[text() ='Why OrangeHRM']")
	private WebElement Header_why_orangehrm;

	@FindBy(xpath = "//a[text() ='Resources']")
	private WebElement Header_Resources;

	@FindBy(xpath = "//a[text() ='Company']")
	private WebElement Header_Company;

	@FindBy(xpath = "//input[@id='Form_submitForm_EmailHomePage']")
	private WebElement EmailId_Filed;

	@FindBy(xpath = "//input[@id='Form_submitForm_action_request']")
	private WebElement Freetrail_Button;

	@FindBy(xpath = "//input[@id='Form_getForm_action_submitForm']")
	private WebElement your_freetrail_Button;
	
	@FindBy(xpath = "//span[@class='description']")
	private WebElement Error_Message;

	public WebElement getHeader_Solution() {
		return Header_Solution;
	}

	public WebElement getHeader_why_orangehrm() {
		return Header_why_orangehrm;
	}

	public WebElement getHeader_Resources() {
		return Header_Resources;
	}

	public WebElement getHeader_Company() {
		return Header_Company;
	}

	public WebElement getEmailId_Filed() {
		return EmailId_Filed;
	}

	public WebElement getFreetrail_Button() {
		return Freetrail_Button;
	}

	public WebElement getyour_freetrail_Button() {
		return your_freetrail_Button;
	}
	
	public WebElement getError_Message() {
		return Error_Message;
	}
}