package handleProgressBar;

/**
 * @author Varsha Narwaria
 * @Project: Handling Progress Bar
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
 * Test Case: To Reset the progress bar once it completed
 * 1. Open URL
 * 2. Click 'Start' button
 * 3. Wait till progress bar completed 100%
 * 4. Click 'Reset' button
 * 5. Verify if 'reset' button is clicked
 */

public class ProgressBarReset {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/progress-bar");

		WebElement startStopButton = driver.findElement(By.id("startStopButton"));
		startStopButton.click();

		WebElement progressBar = driver.findElement(By.xpath("//div[@id='progressBar']/div"));

		WebDriverWait wait = new WebDriverWait(driver, 10);

		boolean progressBarStatus = wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "100"));

		if (progressBarStatus == true) {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='resetButton']"))).click();
		}
		
		boolean afterResetStatus = wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "0"));
		if(afterResetStatus == true) {
			System.out.println("Reset");
		}
		else {
			System.out.println("Not Reset");
		}
		Thread.sleep(1000);
		driver.quit();
	}
}
