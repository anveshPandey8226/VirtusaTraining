package com.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserOpenHelper {
	
	public BrowserOpenHelper() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	}
		
	public WebDriver selectBrowser(String browser) {
		
		WebDriver driver = null;
		
		if(browser == "Chrome") {
			driver = new ChromeDriver();
		}
		else if(browser == "Firefox") {
			System.out.println("Not there !!!");
		}
		else {
			System.out.println("Not there !!!");
		}
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Inside Select Browser");
			System.out.println("Error is : "+ e.getMessage());
		}
		
		return driver;
		
	}

}
