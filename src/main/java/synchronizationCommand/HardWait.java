package synchronizationCommand;

/**
 * @author Varsha Narwaria
 * @Project: Synchronization Commands 
 * @Date: January 09, 2023
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Test Case: Click on 'Apple' link using hard wait 
 * 1. Open URL
 * 2. Hover over 'Electronics' tab
 * 3. Electronics tab will expand
 * 4. Click on 'Apple' link
 * 5. Verify if 'Apple' link is clicked successfully or not
 */

public class HardWait {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		WebElement element = driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]/a"));
		Actions action = new Actions(driver);

		action.moveToElement(element).perform();

		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"));
		element1.click();

		Thread.sleep(2000);
		
		String pageTitile = driver.getTitle();
		System.out.println(pageTitile);

		if (pageTitile.equals("Apple products for sale | eBay")) {
			System.out.println("Navigated to Apple page of ebay");
		} else {
			System.out.println("Not Navigated to Apple page of ebay");
		}
		driver.quit();

	}

}
