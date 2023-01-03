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
 * Check click and hold operation is working or not 
 * 1. Open the URL 
 * 2. Click and hold box labeled 'One' 
 * 3. Move box 'One' to box 'Two' 
 * 4. Verify box is clicked, hold and moved
 */

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// opens safari browser
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/sortable");

		WebElement One = driver.findElement(By.xpath("//div[@id='demo-tabpane-list']/div/div[1]"));
		WebElement Two = driver.findElement(By.xpath("//div[@id='demo-tabpane-list']/div/div[2]"));

		Actions action = new Actions(driver);

		/**
		 * clickAndHold​(WebElement target) Clicks 
		 * (without releasing) in the middle of the given element.
		 */
		action.clickAndHold(One);
		Thread.sleep(3000);
		action.moveToElement(Two).release().perform();
		
		String text= One.getText();
		if(text.equals("Two")) {
			System.out.println("Box One gets clicked, hold and then moved");
		}
		else {
			System.out.println("Box One doesn't get clicked, hold and moved");
		}

		Thread.sleep(2000);
		driver.quit();
	}

}
