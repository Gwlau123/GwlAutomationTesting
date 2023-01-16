package synchronizationCommand;

/**
 * @author Varsha Narwaria
 * @Project: Synchronization Commands 
 * @Date: January 09, 2023
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Test Case: Click on 'Apple' link using fluent wait 
 * 1. Open URL
 * 2. Hover over 'Electronics' tab
 * 3. Electronics tab will expand
 * 4. Click on 'Apple' link
 * 5. Verify if 'Apple' link is clicked successfully or not
 */

public class FluentWaitDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		WebElement element = driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]/a"));
		Actions action = new Actions(driver);

		action.moveToElement(element).perform();
		/*
		 * Syntax of Fluent wait: Wait<WebDriver> wait = new
		 * FluentWait<WebDriver>(driver) 
		 * .withTimeout(30, TimeUnit.SECONDS)
		 * .pollingEvery(5, TimeUnit.SECONDS) 
		 * .ignoring(NoSuchElementException.class);
		 */
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

		WebElement element1 = driver
				.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"));

		wait.until(ExpectedConditions.visibilityOf(element1)).click();

		Thread.sleep(2000);
		String pageTitile = driver.getTitle();
		System.out.println(pageTitile);

		if (pageTitile.equals("Apple products for sale | eBay")) {
			System.out.println("Navigated to Apple page of ebay");
		} else {
			System.out.println("Not Navigated to Apple page of ebay");
		}
		Thread.sleep(2000);

		driver.quit();
	}

}
