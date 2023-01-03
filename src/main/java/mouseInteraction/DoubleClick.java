package mouseInteraction;

/**
 * @author Varsha Narwaria
 * @Project: Interaction with Mouse 
 * @Date: December 26, 2022
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Test Case 
 * Check double click operation is working or not 
 * 1. Open the URL 
 * 2. Double click on the textfield with 'Clickable' placeholder 
 * 3. Verify the text 'doubled-click' appears
 */

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * Safari browser doesn't support DoubleClick method. 
		 * One has to take help of Javascript to automate doubleCLick for safari browser.
		 */
		// opens safari browser
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

		WebElement clickable = driver.findElement(By.id("clickable"));

		/**
		 * doubleClick​(WebElement target) method
		 * Performs a double-click at middle of the given element.
		 */

		Actions action = new Actions(driver);
		action.doubleClick(clickable).perform();
		
		WebElement doubleClickText = driver.findElement(By.id("click-status"));
		String text = doubleClickText.getText();
		if(text.equals("double-clicked")) {
			System.out.println("double-clicked");
		}
		else {
			System.out.println("Not double-clicked");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
