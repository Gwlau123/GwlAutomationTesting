package mouseInteraction;

/**
 * @author Varsha Narwaria
 * @Project: Interaction with Mouse 
 * @Date: December 26, 2022
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Test Case 
 * Verify right click working or not 
 * 1. Open URL 
 * 2. Right click on 'Right Click Me' button 
 * 3. Click 'Paste' from menu
 * 4. Verify alert
 */

public class MouseRightClick {
	public static void main(String[] args) throws InterruptedException {
		// opens safari browser
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");


		WebElement BoxA = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));

		Actions action = new Actions(driver);
		/**
		 * contextClick​(WebElement target) method 
		 * Performs a context-click at middle of the given element.
		 */
		action.contextClick(BoxA).perform();
		Thread.sleep(1000);

		WebElement paste =  driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[4]"));
		action.contextClick(paste).perform();
		Thread.sleep(1000);

		String text = driver.switchTo().alert().getText();		
		if (text.contains("paste")) {
			System.out.println("Paste clicked");
		} else {
			System.out.println("Paste not clicked");
		}
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.quit();
	}

}
