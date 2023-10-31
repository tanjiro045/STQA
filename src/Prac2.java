import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prac2 {
	
	static WebDriver wd;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunny sh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.ChromeBrowser \n2. Firefox Broswer");
		System.out.println("Choice");
		int ch = sc.nextInt();
		sc.close();
		switch (ch)
		{
		case 1:
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunny sh\\Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			wd = new ChromeDriver();
			break;
		case 2:
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Sunny sh\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			wd = new FirefoxDriver();
		default:
			System.out.println("Invalid Choice");
			break;
		}
		if(wd!=null)
		{
		wd.get("http:\\google.com");
		}

	}

}
