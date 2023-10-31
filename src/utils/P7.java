package utils;

//implicit wait
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aTitle = "";
		String eTitle = "Logged In Successfully | Practice Test Automation";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.get("https://practicetestautomation.com/practice-test-login/");
		wd.findElement(By.name("username")).sendKeys("student");//locator id
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		wd.findElement(By.name("password")).sendKeys("Password123");//locater name
		wd.findElement(By.id("submit")).click();//locatorclassName
		aTitle = wd.getTitle();
		if (aTitle.equals(eTitle)) {
		System.out.println("Test Passed");
		} else {
		System.out.println("Test Failed");
		}

	}

}
