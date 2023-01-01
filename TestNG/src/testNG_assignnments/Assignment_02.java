package testNG_assignnments;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.helper.BrowserOpenHelper;
import com.qa.pages.Facebook;

public class Assignment_02 {
	
	static WebDriver driver;
	static Facebook fb;
	
	@BeforeTest
	public void beforeTest() {
		BrowserOpenHelper browser = new BrowserOpenHelper();
		driver = browser.selectBrowser("Chrome");
	}
	
	@Test(priority = 0)
	public void checkNavigateToFB() throws InterruptedException {
		fb = new Facebook(driver);
		System.out.println("Facebook : "+fb.getClass());
		fb.navigateToURL("www.fb.com");
	}
	
	@Test(priority = 1)
	public void verifyPage() {
		fb.getTitle();
		fb.titleMatching("www.facebook.com");
	}
	
	@Test(priority = 2)
	public void verifyCreateAnAccount() throws InterruptedException {
		fb.verifySignUpButton();
	}
	
	@Test(priority = 3)
	public void checkFillingDetails() {
		fb.fillDetails_Textbox("Anvesh", "pandey", "xyuz@gmail.com", "anveshkp");
	}
	
	@Test(priority = 4)
	public void checkFillingDOB() {
		fb.selectDates("14", "June", "2002");
	}
	
	@Test(priority = 5)
	public void selectGender() {
		fb.selectGender();
	}
	
	@Test(priority = 6)
	public void checkFinalSubmit() {
		fb.signUpButtonSubmit();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
