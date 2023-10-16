package greatproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class omni {
	@Test
	public void secondtest() throws InterruptedException
	{

	//public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://liveauction-omni-dev.i-ways-network.org/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("EmailField")).sendKeys("admin@i-ways.net");
		driver.findElement(By.name("PasswordField")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/form/button/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.className("jss279")).click();

		driver.findElement(By.id("EventName")).sendKeys("My Event");
		driver.findElement(By.id("EventHeadline")).sendKeys("Purchase");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"))
				.sendKeys("Bidding");
		 Thread.sleep(2000);
		WebElement ddown = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/span[2]/div[1]/div[1]/div[1]"));
		ddown.click();
		driver.findElement(By.xpath("//div[contains(text(),'true')]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/span[2]/div[1]/div[1]/div[1]/div[1]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'false')]")).click();
		WebElement datebox = driver.findElement(By.id("PublishingTime"));
		datebox.click();
		datebox.sendKeys("11122022");
		// Press tab to shift focus to time field
		datebox.sendKeys(Keys.TAB);
		// Fill time as 02:45 PM
		datebox.sendKeys("0245PM");
		WebElement start = driver.findElement(By.id("StartingTime"));
		start.click();
	start.sendKeys("11192022");
	start.sendKeys(Keys.TAB);
		start.sendKeys("0950PM");
		WebElement liveStream=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[8]/div[1]/span[2]/div[1]/div[1]/div[1]"));
				liveStream.click();
				Thread.sleep(2000);
			Actions ls= new Actions(driver);
			ls.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
		driver.findElement(By.xpath("//div[contains(text(),'true')]")).click();
		
		  WebElement sellingEvent=driver.
	  findElement(By.xpath("//div[contains(text(),'Selling Event')]"));
		  sellingEvent.click(); Thread.sleep(2000); Actions se= new Actions(driver);
	  se.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN.ENTER).perform();
		 
		WebElement live = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[8]/div[1]/span[2]/div[1]/div[1]/div[1]"));
		live.click();
		driver.findElement(By.xpath("//div[contains(text(),'true')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'false')]")).click();
		driver.findElement(By.name("EventAuctionTimeFrame")).sendKeys("1");
		driver.findElement(By.name("ParallelAuctions")).sendKeys("20");
		WebElement select1 = driver.findElement(By.id(
				"BiddingIncProfileId"));
		select1.click();
		Actions bd = new Actions(driver);
		bd.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN.ENTER).perform();
		WebElement timeline = driver.findElement(By.id(
			"EventTimelineProfileId"));
		timeline.click();
		driver.findElement(By.xpath("//div[contains(text(),'Test Timeline Profile')]")).click();
		driver.findElement(By.name("MaximumItemsCount")).sendKeys("30");
		driver.findElement(By.name("MinimumItemsCount")).sendKeys("1");
		WebElement cl=driver.findElement(By.name("BreakBetween"));
		cl.sendKeys(Keys.BACK_SPACE);
		cl.sendKeys(Keys.BACK_SPACE);
		cl.sendKeys("20");
		WebElement language = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[18]/div[1]/span[2]/div[1]/div[1]/div[1]/div[1]"));
		language.click();
		Actions cn= new Actions(driver);
		cn.sendKeys(Keys.ARROW_DOWN.ENTER).perform();
		//driver.findElement(By.xpath("//div[contains(text(),'English')]")).click();
		WebElement Country = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[19]/div[1]/div[1]/div[1]"));
	    Country.click();
	    List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement ei : chkbox)
			ei.click();
		Thread.sleep(4000);
		driver.findElement(By.id("myfile"))
				.sendKeys("C:\\Users\\kamran\\Desktop");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add")).click();
		
	}

	}
}

	



