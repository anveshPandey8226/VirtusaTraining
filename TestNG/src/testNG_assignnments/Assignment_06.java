package testNG_assignnments;

import com.qa.pages.*;
import com.helper.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Assignment_06 {
	
	static WebDriver driver;
	static Flipkart fk;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		BrowserOpenHelper browser = new BrowserOpenHelper();
		driver = browser.selectBrowser("Chrome");
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
	}
	
	@Test(priority=0)
	public void pressLoginBtn() throws InterruptedException {
		fk = new Flipkart(driver);
		fk.clickOnLoginBtn();
	}
	
	
	@Test(priority=1)
	public void enterUsername() {
		fk.enterEmail("anvesh262001@gmail.com");
	}
	
	
	@Test(priority=2)
	public void enterPassword() {
		fk.enterPass("akp@262001");
	}
	
	@Test(priority=3)
	public void clickFinalLogin() throws InterruptedException {
		fk.clickFinalLogin();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
}