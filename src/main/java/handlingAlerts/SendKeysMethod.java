package handlingAlerts;

/**
 * @author Varsha Narwaria
 * @Project: Handling Alert
 * @Date: January 02, 2023
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Test Case 
 * To enter text in prompt alert 
 * 1. Open URL 
 * 2. Click 'Click me' button next to 'On button click, prompt box will appear'.
 * 3. Alert will appear, enter text in alert's.
 * 4. Verify if text is entered successfully.
 */

public class SendKeysMethod {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("varsha");
		Thread.sleep(2000);
		alert.accept();
		
		String alertText = driver.findElement(By.id("promptResult")).getText();
		Thread.sleep(2000);
		if (alertText.contains("You entered varsha")) {
			System.out.println("entered text successfully in prompt alert");
		} else {
			System.out.println("Not entered text successfully in prompt alert");
		}
		driver.quit();
	}

}
