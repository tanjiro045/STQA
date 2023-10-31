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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//Demonstrate Handling Drop Down and List Boxes.
//A} ListBox
public class P9b {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://127.0.0.1:5500/index.html");
        Select s = new Select(wd.findElement(By.id("car")));
        if (s.isMultiple()) {
            s.selectByIndex(1);
            s.selectByValue("3");
            s.selectByVisibleText("Audi");
            Thread.sleep(2000);
            //s.deselectByIndex(1);
            s.deselectAll();
        }
	}

}
