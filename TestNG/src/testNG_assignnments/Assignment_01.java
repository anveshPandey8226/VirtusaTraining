package testNG_assignnments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.helper.*;
import com.qa.pages.*;

public class Assignment_01 {
	
	static WebDriver driver;
	static Basic b;
	
	@BeforeTest
	public void beforeTest() {
		BrowserOpenHelper browser = new BrowserOpenHelper();
		driver = browser.selectBrowser("Chrome");
	}
	
	@Test(priority = 0)
	public void checkNavigateToFB() throws InterruptedException {
		b = new Basic(driver);
		b.navigateToURL("http://iamneo.ai");
	}
	
	@Test(priority = 1)
	public void checkTitleMatching() {
		b.getTitle();
		b.titleMatching("We are Hiring");
	}
	
	@Test(priority = 2)
	public void getUrl() throws InterruptedException {
		b.navigateToURL("https://www.facebook.com");
	}
	
	@Test(priority = 3)
	public void checkBackNavigation() {
		b.navigateBack();
	}
	
	@Test(priority = 4)
	public void printTitle() {
		b.printCurrentURL();
	}
	
	@Test(priority = 5)
	public void forwardnavigation() {
		b.navigateForward();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}

