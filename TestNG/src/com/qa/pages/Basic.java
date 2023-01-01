package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Basic {
	
	WebDriver driver ;
	String titleOfThePage;
	
	public Basic(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToURL(String URL) throws InterruptedException {
		driver.navigate().to(URL);
		Thread.sleep(5000);
	}
	
	public void printCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL :: " + currentUrl);
		
	}
	
	public void getTitle() {
		titleOfThePage = driver.getTitle();
	}
	
	public void titleMatching(String compare) {
		Assert.assertEquals(compare, titleOfThePage,"Titles of the website do not match");
	}
	
	public void navigateBack() {
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().refresh();
	}

	public void navigateForward() {
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().refresh();
	}

}
