package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	
	WebDriver driver;
	By SignIn_btn = By.xpath("//div[@class=\"accountInner\"]");
	By login_btn = By.xpath("//span[@class=\"accountBtn btn rippleWhite\"]");
	By username_textbox = By.xpath("//*[@id=\"userName\"]");
	By ctd_btn = By.xpath("//*[@id=\"checkUser\"]");
	
	public Snapdeal(WebDriver driver) {
		this.driver = driver;
	}

	public void hold() throws InterruptedException {
		WebElement hold = driver.findElement(SignIn_btn);
		Actions action = new Actions(driver);
		action.moveToElement(hold).perform();;
		Thread.sleep(2000);
	}
	
	
	public void enterEmail(String username) throws InterruptedException {
		driver.findElement(username_textbox).sendKeys(username);
		driver.findElement(ctd_btn).click();
		
	}

	public void clickLogIn() throws InterruptedException {
		driver.findElement(login_btn).click();
		Thread.sleep(2000);
	}
	

}
