package com.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearchHelper {
	
	WebDriver driver;
	
	
	public GoogleSearchHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By searchbox = By.name("q");
	By search_btn = By.xpath("(//input[1][@class=\"gNO89b\"])[1]");
	
	
	
	
	public void googleSearch(String searchInput) throws InterruptedException {
		System.out.println(searchInput);
		driver.findElement(searchbox).sendKeys(searchInput);
		Thread.sleep(2000);
		driver.findElement(search_btn).click();
		Thread.sleep(2000);
	}
	

}
