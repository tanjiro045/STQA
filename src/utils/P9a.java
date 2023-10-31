package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
//Demonstrate Handling Drop Down and List Boxes.
//A} DropDown
public class P9a {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // By ID
        driver.findElement(By.name("user-name")).sendKeys("standard_user");// locatorid
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");// locatername
        Thread.sleep(5000);
        driver.findElement(By.id("login-button")).click();// locator className
        Thread.sleep(5000);
        // Css Selector ID
        Select s = new Select(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")));
        s.selectByVisibleText("Name (Z to A)");

        Thread.sleep(5000);
        driver.close();

	}

}
