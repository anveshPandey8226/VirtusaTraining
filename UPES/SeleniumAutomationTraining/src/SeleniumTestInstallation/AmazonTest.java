package SeleniumTestInstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.get("https:/www.amazon.in/");
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Iphone X");
		Thread.sleep(3000);
		
		
		
		driver.close();
		
	}
}
