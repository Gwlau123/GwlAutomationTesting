package handlingAlerts;

/**
 * @author Varsha Narwaria
 * @Project: Handling Alert(browser specific)
 * @Date: January 02, 2023
 */
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Test Case 
 * To accept or click 'Ok' button of alert 
 * 1. Open URL 
 * 2. Enter value in 'Customer ID' field
 * 3. Click 'Submit' button. 
 * 4. Confirmation alert will appear, accept the alert.
 * 5. Then success message will appear, accept the alert
 * 6. Verify if 'alert' has accepted or not.
 */
public class AcceptMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		WebElement textbox = driver.findElement(By.name("cusid"));

		textbox.sendKeys("24555");

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();

		alert.accept();

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.alertIsPresent());
		String confirmAlert = alert.getText();
		if(confirmAlert.equals("Customer Successfully Delete!")) {
			System.out.println("Successfully deleted");
		}
		else {
			System.out.println("Successfully not deleted");
		}
		alert.accept();
		driver.quit();
	}

}
