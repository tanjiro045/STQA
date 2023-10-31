package utils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunny sh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		Thread.sleep(2000);
		driver.findElement(By.id("no")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buttoncheck")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("Number of elements:" +elements.size());
		Thread.sleep(2000);
		for (int i = 0; i < elements.size(); i++) {
			System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
			Thread.sleep(2000);
		}
		driver.close();

	}

}
