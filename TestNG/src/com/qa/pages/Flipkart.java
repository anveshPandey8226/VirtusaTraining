package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipkart {
	
	WebDriver driver;
	By login_btn = By.xpath("(//button[@type=\"submit\"])[1]");
	By email_textBox = By.className("_2IX_2-");
	By pass_textBox = By.xpath("//input[@type=\"password\"]");
	By login_internal_btn = By.xpath("(//button[@type=\"submit\"])[2]");
	
	public Flipkart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnLoginBtn() throws InterruptedException {
		driver.findElement(login_btn).click();
		Thread.sleep(1000);
	}
	
	public void enterEmail(String email) {
		driver.findElement(email_textBox).sendKeys(email);
	}
	
	public void enterPass(String pass) {
		driver.findElement(pass_textBox).sendKeys(pass);
	}
	
	public void clickFinalLogin() throws InterruptedException {
		driver.findElement(login_internal_btn).click();
		Thread.sleep(1000);
	}
	
	
	
	

}
