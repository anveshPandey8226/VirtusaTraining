package testNG_assignnments;

import com.qa.pages.*;
import com.helper.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Assignment_05 {
	
	static WebDriver driver;
	static Snapdeal sd;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		BrowserOpenHelper browser = new BrowserOpenHelper();
		driver = browser.selectBrowser("Chrome");
		driver.navigate().to("https://www.snapdeal.com");
		Thread.sleep(2000);
	}
	
	
	@Test(priority=0)
	public void moveSignInHold() throws InterruptedException {
		sd = new Snapdeal(driver);
		sd.hold();
	}
	
	@Test(priority=1)
	public void ckeckSignInClick() throws InterruptedException {
		sd.clickLogIn();
	}
	
	@Test(priority=2)
	public void checkEmailEntryContinue() throws InterruptedException{
		sd.enterEmail("anvesh262001@gmail.com");
	}
	
	
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
}