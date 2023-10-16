package greatproject;
import java.lang.String;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanage {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String currenturl = driver.getCurrentUrl();
	System.out.println("currentUrl");
	driver.getTitle();
	System.out.println("title");
	String pagesource=driver.getPageSource();
	System.out.println("pagesource");
	driver.navigate().to("http://www.google.com");
	driver.close();
	
	}

}
