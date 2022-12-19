package testNG_assignnments;

import com.qa.pages.*;
import com.helper.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Assignment_04 {
	
	static WebDriver driver;
	static Ebay eb;
	
	@BeforeTest
	public void beforeTest() {
		BrowserOpenHelper browser = new BrowserOpenHelper();
		driver = browser.selectBrowser("Chrome");
	}
	
	
	@Test(priority=0)
	public void googleSearchTest() throws InterruptedException {
		GoogleSearchHelper googleSearch = new GoogleSearchHelper(driver);
		googleSearch.googleSearch("Ebay");
	}
	
	@Test(priority=1)
	public void clickOnEbaySite() throws InterruptedException  {
		eb = new Ebay(driver);
		eb.clickOnEbaySite();
	}
	
	@Test(priority=2)
	public void searchProduct() throws InterruptedException {
		eb.searchProduct("Apple Watch");
	}
	
	@Test(priority=3)
	public void searchNProduct() {
		eb.searchNProduct(10);
	}
	
	@Test(priority=4)
	public void serachAll() {
		eb.getAllProducts();
	}
	
	@Test(priority=5)
	public void seachAllScrollDown() {
		eb.getAllProductsViaScrollDown();;
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
