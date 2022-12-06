package SeleniumTestInstallation;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstScript {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		System.out.println("Title is :"+driver.getTitle());
		boolean contains = driver.getTitle().contains("Google");
		if(contains) {
			System.out.println("User landed on Google Page");
		}
		else {
			System.out.println("something wrong");
		}
		
		WebElement SearchTextField = driver.findElement(By.name("q"));
		SearchTextField.sendKeys("Automation Testing");
		Thread.sleep(3000);

		List<WebElement> AllItems = driver.findElements(By.className("sbct"));
		System.out.println("Total items loaded are: " + AllItems.size());
		Thread.sleep(2000);
		 
		SearchTextField.submit();
		Thread.sleep(3000);
		//driver.close();
	
	}

}
