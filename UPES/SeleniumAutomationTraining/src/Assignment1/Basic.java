package Assignment1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
	WebDriver driver ;
	
	public void navigateCommands(WebDriver driver) throws InterruptedException {
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL :: " + currentUrl);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().refresh();
	}
	
	public void invokeBrowser(WebDriver driver) throws InterruptedException {

		
		driver.manage().window().maximize();
		driver.get("http://iamneo.ai");
		Thread.sleep(5000);

		String titleOfThePage = driver.getTitle();

		if (titleOfThePage.equals("We are Hiring")) {
			System.out.println("Test case PASS");
		} else {
			System.out.println("Test case FAIL");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Basic b = new Basic();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		b.invokeBrowser(driver);
		b.navigateCommands(driver);
		driver.close();
				

	}

}
