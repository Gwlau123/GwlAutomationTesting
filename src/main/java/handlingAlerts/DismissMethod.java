package handlingAlerts;

/**
 * @author Varsha Narwaria
 * @Project: Handling Alert
 * @Date: January 02, 2023
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Test Case 
 * To dismiss or click 'Cancel' button of alert 
 * 1. Open URL 
 * 2. Click 'Click me' button next to 'On button click, confirm box will appear'.
 * 3. Alert will appear, dismiss the alert
 * 4. Verify if 'alert' has dismissed or not.
 */

public class DismissMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement textbox = driver.findElement(By.id("confirmButton"));

		textbox.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		String cancelText = driver.findElement(By.id("confirmResult")).getText();
		if(cancelText.equals("You selected Cancel")) {
			System.out.println("Alert dismissed");
		}
		else {
			System.out.println("Alert not dismissed");
		}
		driver.quit();		
	}
}
