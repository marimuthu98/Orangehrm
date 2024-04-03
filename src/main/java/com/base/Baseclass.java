package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	protected WebDriver driver;

	public void browserLanuch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}
	public void Closebrowser() {
           driver.close();
	}

	
	}
	
	
	
	

