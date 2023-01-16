package handleProgressBar;

/**
 * @author Varsha Narwaria
 * @Project: Handling Progress Bar/loader
 * @Date: January 09, 2023
 */

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Test Case: Wait for page to completely load or wait till loader stops
 * 1. Open URL
 * 2. Wait till loader appears on page
 * 3. Then click 'Login' button
 * 4. Verify if 'login' button is clicked or not
 */
public class HandlingLoader {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://skye-stg.unchainedsystems.com/customer/saturn");

		Thread.sleep(2000);
		List<WebElement> loader = driver.findElements(By.xpath("//div[@role='progressbar']"));

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.invisibilityOfAllElements(loader));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Log in')]"))).click();

		boolean loginModal = wait.until(ExpectedConditions
				.attributeContains(By.xpath("//div[@role='dialog']/div[2]/div[1]"), "aria-hidden", "true"));
		System.out.println("loginModal " + loginModal);
		if (loginModal == true) {
			System.out.println("Login Modal has opened");
		} else {
			System.out.println("Login Modal hasn't opened");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
