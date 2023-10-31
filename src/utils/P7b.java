package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Explicit Wait
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
//Explicit Wait
public class P7b {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunny sh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// explicit wait - to wait for the compose button to be click-able
		Duration durationInMinutes = Duration.ofMinutes(30);
		WebDriverWait wait = new WebDriverWait(driver, durationInMinutes);
		
		// launch Chrome and redirect it to the Base URL
		String eTitle = "Test Login | Practice Test Automation";
		String aTitle = "";
		// launch Chrome and redirect it to the Base URL
		driver.get("https://practicetestautomation.com/practice-test-login/");
		//Maximizes the browser window
		driver.manage().window().maximize();
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle)) {
		System.out.println("Test Passed");
		} else {
		System.out.println("Test Failed");
		}
		
		driver.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		WebElement webElement;
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));
		webElement.click();
		

	}

}
