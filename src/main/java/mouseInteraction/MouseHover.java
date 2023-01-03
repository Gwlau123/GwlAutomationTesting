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

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Test Case 
 * Verify mouse hover working or not 
 * 1. Open URL 
 * 2. Mouse hover over 'bell Icon' at header 
 * 3. Verify notification menu opens
 */

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		WebElement bellIcon = driver.findElement(By.xpath("//li[@id='gh-eb-Alerts']/div/button"));
		Actions action = new Actions(driver);
		/**
		 * moveToElement(WebElement target) method 
		 * moves the mouse to middle of the element
		 */
		action.moveToElement(bellIcon).perform();

		WebElement notiMenu = driver.findElement(By.xpath("//li[@id='gh-eb-Alerts']/div/button"));
		
		String atb = notiMenu.getAttribute("aria-expanded");
		if (atb.equals("true")) {
			System.out.println("On Mouse hover, notification menu has open");
		} else {
			System.out.println("On Mouse hover, notification menu doesn't open");
		}

		Thread.sleep(2000);
		driver.quit();
	}

}
