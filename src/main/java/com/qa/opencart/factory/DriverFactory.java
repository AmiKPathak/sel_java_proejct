package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencart.errors.AppError;
import com.qa.opencart.exceptions.FrameworkException;

public class DriverFactory {
	
	
	public WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("browser name :" + browserName);
		
		switch(browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;	
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;	
		case "safari":
			driver = new SafariDriver();
			break;	
		
		default:
			System.out.println(AppError.INVALID_Browser_Message + browserName);
			throw new FrameworkException("=======INVALID BROWSER");	
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		return driver;
	
		
		
		
	}

}
