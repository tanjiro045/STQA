package utils;

//P8 - Demonstrate different types of alerts
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
//
public class P8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
        Thread.sleep(2000);
        // Switching to Alert
        Alert alert = webDriver.switchTo().alert();

        // Capturing and printing alert message.
        System.out.println(webDriver.switchTo().alert().getText());

        alert.accept();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
        Thread.sleep(2000);
        // Switching to Alert
        alert = webDriver.switchTo().alert();

        // Capturing and printing alert message.
        System.out.println(webDriver.switchTo().alert().getText());
        alert.accept();

        webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
        Thread.sleep(2000);
        // Switching to Alert
        alert = webDriver.switchTo().alert();
        alert.sendKeys("Goku");
        Thread.sleep(2000);
        // Capturing and printing alert message.
        System.out.println(webDriver.switchTo().alert().getText());
        alert.accept();
        System.out.println(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/p")).getText());

        Thread.sleep(2000);
        //webDriver.close();
		

	}

}
