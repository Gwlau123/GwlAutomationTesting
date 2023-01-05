package handlingAlerts;

/**
 * @author Varsha Narwaria
 * @Project: Handling Alert(browser specific)
 * @Date: January 02, 2023
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Test Case 
 * To accept or click 'OK' button of alert 
 * 1. Open URL 
 * 2. Click 'Try it' button 
 * 3. Alert will appear, get text from alert 
 * 4. Verify text.
 */
public class GetTextMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);

		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		button.click();
		Thread.sleep(2000);
		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains("Hello! I am an alert box!")) {
			System.out.println("Alert text is- " + alertText);
		} else {
			System.out.println("not get text");
		}
		driver.quit();
	}
}
