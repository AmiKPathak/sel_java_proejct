package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest	 {
	
	@Test
	public void loginPageTitleTest() {
		String actualTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, "Account Login");
	}
    
	
	@Test
	public void loginPageURLTest() {
		String actualURL = loginPage.getLoginPageURL();
		Assert.assertTrue(actualURL.contains("route=account/login"));
	}
	
	@Test
	public void isForgotPswdLinkExist() {
		Assert.assertTrue( loginPage.isForgotPswdLinkExist());	
	}
	
	@Test
	public void isheaderExist() {
		Assert.assertTrue( loginPage.isheaderExist());	
	}
	
	@Test
	public void loginTest() {
		String actActPageTitle = loginPage.doLogin("march2024@open.com", "Selenium@123");
		Assert.assertEquals(actActPageTitle, "My Account");
		
	}
}
