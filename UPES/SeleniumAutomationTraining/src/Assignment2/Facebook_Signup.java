package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		System.out.println("Title is : "+driver.getTitle());
		
		boolean contains = driver.getTitle().contains("Facebook");
		if(contains) {
			System.out.println("User landed on Facebook Page");
		}
		else {
			System.out.println("something wrong");
		}
		
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		System.out.println("Sign UP button Verifed");
		
		Thread.sleep(10000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement surname = driver.findElement(By.name("lastname"));
		WebElement mail = driver.findElement(By.name("reg_email__"));
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		
		firstname.sendKeys("Demo_0714");
		surname.sendKeys("Demo_07");
		mail.sendKeys("kawet51364@turuma.com");
		pass.sendKeys("DEMO");
	
		Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		selDate.selectByVisibleText("7");
		selMonth.selectByVisibleText("Jun");
		selYear.selectByVisibleText("2001");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		


	}

}
