package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Ebay {
	
	WebDriver driver;
	int itemNumber = 1;
	By clickOnEbay = By.xpath("//a[@href = \"https://www.ebay.com/\"]");
	By search_box = By.className("gh-tb");
	By magnifier_btn = By.className("btn");
	
	
	public Ebay(WebDriver driver) {
		this.driver = driver;
	}

	
	public void clickOnEbaySite() throws InterruptedException {
		driver.findElement(clickOnEbay).click();
		Thread.sleep(2000);
	}
	
	public void searchProduct(String product) throws InterruptedException {
		driver.findElement(search_box).sendKeys(product);
		driver.findElement(magnifier_btn).click();
		Thread.sleep(2000);
		
	}
	
	public void searchNProduct(int itemNumber) {
		this.itemNumber = itemNumber;
		By product_select_xpath = By.xpath(String.format("(//li[@class=\"s-item s-item__pl-on-bottom\"])[%d]", itemNumber));
		String nthProduct = driver.findElement(product_select_xpath).getText();
		System.out.println("Nth Product :: "+ nthProduct);
	}
	
	public void getAllProducts(){
		List<WebElement> allProduct = driver.findElements(By.xpath("//li[@class=\"s-item s-item__pl-on-bottom\"]"));
		
		for(WebElement product: allProduct){
			System.out.println(product.getText());
			
			System.out.println("-----------------------------------------");
		}
	}
	
	public void getAllProductsViaScrollDown(){
		List<WebElement> allProduct = driver.findElements(By.xpath("//li[@class=\"s-item s-item__pl-on-bottom\"]"));
		Actions action = new Actions(driver);
		
		for(WebElement product: allProduct){
			
			action.moveToElement(product).build().perform();
			
			System.out.println(product.getText());
			
			System.out.println("-----------------------------------------");
		}
	}
	

}
