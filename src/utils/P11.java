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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P11 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunny sh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver wd = new ChromeDriver();
	        wd.get("https://practicetestautomation.com/practice-test-login/");
	        wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        wd.findElement(By.id("username")).sendKeys("student");//locator id
	        wd.findElement(By.id("password")).sendKeys("Password123");//locater nam
	         Thread.sleep(5000);
	        wd.findElement(By.id("submit")).click();//locatorclassName
	        Actions act = new Actions(wd);
	        List<WebElement> menu = wd.findElements(By.xpath("/html/body/div/div/header/div[3]/div[1]/div/div[2]/div/nav/ul"));
	        for (int i = 0; i <= menu.size() - 1; i++) {
	            System.out.println(menu.get(i).getText());//print text of all the element on console
	            act.moveToElement(menu.get(i)).perform();//toperform mousehover on all elements of list 
	            Thread.sleep(5000);
	        }
	        //wd.navigate().to("https://practicetestautomation.com/practice-test-login/");
	        wd.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div/div/div/a")).click();
	        Thread.sleep(2000);
	        System.out.println("Logout");
	        wd.close();
	}

}
