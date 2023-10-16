package greatproject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Greatclass {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("kamran_jan44@yahoo.com");
	driver.findElement(By.id("pass")).sendKeys("40484801");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	driver.findElement(By.className("x1lliihq x6ikm8r x10wlt62 x1n2onr6"));
	driver.findElement(By.xpath("//*[@id=\"mount_0_0_3P\"]/div[1]/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[2]/span/div/a/span/svg")).click();
	//driver.quit();
	}

}
