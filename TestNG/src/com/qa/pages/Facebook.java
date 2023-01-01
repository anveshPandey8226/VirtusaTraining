package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Facebook {
	
	WebDriver driver;
	String titleOfThePage;
	WebElement firstname = driver.findElement(By.name("firstname"));
	WebElement surname = driver.findElement(By.name("lastname"));
	WebElement mail = driver.findElement(By.name("reg_email__"));
	WebElement pass = driver.findElement(By.name("reg_passwd__"));
	Select selDate = new Select(driver.findElement(By.id("day")));
	Select selMonth = new Select(driver.findElement(By.id("month")));
	Select selYear = new Select(driver.findElement(By.id("year")));
	By signUp_btn = By.xpath("//a[@data-testid=\"open-registration-form-button\"]");
			
	public Facebook(WebDriver driver) {
		this.driver = driver;
		System.out.println("Driver : "+driver);
	}
	
	
	public void navigateToURL(String URL) throws InterruptedException {
		driver.navigate().to(URL);
		Thread.sleep(5000);
	}
	
	public void getTitle() {
		titleOfThePage = driver.getTitle();
	}
	
	public void titleMatching(String compare) {
		Assert.assertEquals(compare, titleOfThePage,"Titles of the website do not match");
	}
	
	
	public void verifySignUpButton() throws InterruptedException {
		driver.findElement(signUp_btn).click();
		System.out.println("Sign UP button Verifed");
		Thread.sleep(10000);
	}
	
	
	public void fillDetails_Textbox(String firstname, String surname, String mail, String pass) {
		this.firstname.sendKeys(firstname);
		this.surname.sendKeys(surname);
		this.mail.sendKeys(mail);
		this.pass.sendKeys(pass);
	}
	
	public void selectDates(String day,String month, String year) {
		selDate.selectByVisibleText(day);
		selMonth.selectByVisibleText(month);
		selYear.selectByVisibleText(year);
	}
	
	public void selectGender() {
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
	}
	
	public void signUpButtonSubmit() {
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
}
