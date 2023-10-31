package utils;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P4 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunny sh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				 driver = new ChromeDriver();
				 String appUrl = "https://en.wikipedia.org/wiki/Main_Page";
				 driver.get(appUrl);
				 Thread.sleep(4000);
				 // Click on Contact Us
				 driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/p/i[1]/b/a")).click();
				 Thread.sleep(4000);
				 // Go back to Home Page
				 driver.navigate().back();
				 Thread.sleep(4000);
				 // Go forward to Contact Us
				 driver.navigate().forward();
				 Thread.sleep(4000);
				 // Go back to Home page
				 driver.navigate().to(appUrl);
				 Thread.sleep(4000);
				 // Refresh browser
				 driver.navigate().refresh();
				 Thread.sleep(4000);
				 // Close browser
				 driver.close();

	}

}
