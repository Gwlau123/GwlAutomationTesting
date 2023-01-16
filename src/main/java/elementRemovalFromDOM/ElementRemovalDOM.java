package elementRemovalFromDOM;

/**
 * @author Varsha Narwaria
 * @Project: Check for element removal from DOM 
 * @Date: January 09, 2023
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Test Case: Check if the element has removed from DOM
 * 1. Open URL
 * 2. Wait and check if element is removed form DOM
 * 3. Verify it
 */
public class ElementRemovalDOM {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("file:///Users/gwl/git/GwlAutomationTesting/src/main/java/elementRemovalFromDOM/Result.html");

		WebElement element = driver.findElement(By.id("removeObj"));
		WebDriverWait wait = new WebDriverWait(driver, 60);
		boolean elementStatus = wait.until(ExpectedConditions.invisibilityOf(element));

		if (elementStatus == true) {
			System.out.println("Element has removed");
		} else {
			System.out.println("Element hasn't removed");
		}
		driver.quit();
	}
}
