package utils;
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
//P6 - Demonstrate the Locator. (id, css selector, path)
public class P6 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		// TODO code application logic here
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://practicetestautomation.com/practice-test-login/");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.findElement(By.name("username")).sendKeys("student");
		Thread.sleep(2000);
		wd.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		wd.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html/body/div/div/header/div[3]/div[1]/div/div[2]/div/nav/ul/li[2]/a"
		)).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div[2]/div[1]/p/a")).click();
		Thread.sleep(1000);
		wd.findElement(By.cssSelector("#add_btn")).click();
		Thread.sleep(4000);
		wd.navigate().to("https://practicetestautomation.com/");
		Thread.sleep(2000);
		wd.close();

	}

}
