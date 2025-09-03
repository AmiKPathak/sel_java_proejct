package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;

	//Private By Locators --- page objects or page elements
	
	private final By emailID = By.id("input-email");
	private final By psword = By.id("input-password");
	private final By loginbtn = By.xpath("//input[@type='submit']");
	private final By forgotPswdLink = By.linkText("Forgotten Password");
	private final By header = By.tagName("h2");	
	
	//public constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//public page methods/actions
	public String getLoginPageTitle() {
		 String title = driver.getTitle();
		 System.out.println("login page title:"+ title);
		 return title;
	}
	
	public String getLoginPageURL() {
		 String pageURL = driver.getCurrentUrl();
		 System.out.println("login page url:"+ pageURL);
		 return pageURL;
	}
	
	public boolean isForgotPswdLinkExist() {
		return driver.findElement(forgotPswdLink).isDisplayed();
	}
	
	public boolean isheaderExist() {
		return driver.findElement(header).isDisplayed();
	}
	
	public String doLogin(String appusername, String apppswd) {
		System.out.println("Application credential: " + appusername + ":" + apppswd);
		driver.findElement(emailID).sendKeys(appusername);
		driver.findElement(psword).sendKeys(apppswd);
		driver.findElement(loginbtn).click();
		return driver.getTitle();
		
		
		
	}
	
	
	
	
	
	
	
	
}
