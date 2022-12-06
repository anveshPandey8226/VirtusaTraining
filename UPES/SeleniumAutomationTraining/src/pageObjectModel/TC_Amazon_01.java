package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.pages.AmazonPages;

public class TC_Amazon_01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		AmazonPages AmazonOR = new AmazonPages(driver);
		driver.get("https:/www.amazon.in/");
		driver.manage().window().maximize();
		
		boolean contains = driver.getTitle().contains("Amazon");
		if(contains) {
			System.out.println("User landed on Amazon Page");
		}
		else {
			System.out.println("something wrong");
		}
		
		Select cat = AmazonOR.getCategory();
		System.out.println("TEMP : "+cat);
		cat.selectByVisibleText("Books");
		AmazonOR.getSearchTextField().sendKeys("Da Vinci Code");
		AmazonOR.getMagnifierBtn().click();
		
		boolean contains1 = driver.getTitle().contains("da dinci code");
		if(contains1) {
			System.out.println("Items related to the search term loaded");
		}
		else {
			System.out.println("something wrong");
		}
		
		List<WebElement> AllItems = AmazonOR.getAllElements();
		System.out.println("Total items loaded are: " + AllItems.size());
		Thread.sleep(2000);
		
		driver.close();
	}
}
