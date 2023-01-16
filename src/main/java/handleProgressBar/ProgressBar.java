package handleProgressBar;

/**
 * @author Varsha Narwaria
 * @Project: Handling Progress bar 
 * @Date: January 09, 2023
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Test Case: To start and stop Progress bar
 * 1. Open URL
 * 2. Click 'Start' button
 * 3. Wait till progress bar completed 50%, then click 'stop' button
 * 4. Wait for few seconds, then click 'Start' button
 * 5. Wait till progress bar completed (100%)
 * 6. Verify progress bar completed or not
 */

public class ProgressBar {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/progress-bar");

		WebElement startStopButton = driver.findElement(By.id("startStopButton"));
		startStopButton.click();

		WebElement progressBar = driver.findElement(By.xpath("//div[@id='progressBar']/div"));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.pollingEvery(Duration.ofMillis(100));

		boolean progressBarStatus = wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "50"));
		System.out.println("Progress Bar status is " + progressBarStatus);

		if (progressBarStatus == true) {
			startStopButton.click();
		}

		Thread.sleep(5000);

		startStopButton.click();

		boolean completionStatus = wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "100"));
		if (completionStatus == true) {
			System.out.println("Completed");
		} else {
			System.out.println("Not Completed");
		}
		Thread.sleep(1000);

		driver.quit();
	}
}
