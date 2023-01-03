package mouseInteraction;

/**
 * @author Varsha Narwaria
 * @Project: Interaction with Mouse 
 * @Date: December 26, 2022
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Test Case 
 * Verify drag and drop to specific position working or not 
 * 1. Open URL 
 * 2. Drag the right bottom corner of resizable box 
 * 3. Drop the element at specific position 
 * 4. Verify element is successfully dragged and dropped
 */

public class DragAndDropBy {
	public static void main(String[] args) throws InterruptedException {
		// opens safari browser
		WebDriverManager.safaridriver().setup();
		SafariDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		
		//As element is in a iFrame so we need to switch to that frame
		WebElement frame = driver.findElement(By.xpath("//div[@id='content']//iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);

		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));

		Actions action = new Actions(driver);
		/**
		 * dragAndDropBy​(WebElement source, int xOffset, int yOffset) method performs
		 * click-and-hold at the location of the source element moves by a given offset then releases the mouse
		 */
		action.dragAndDropBy(resize, 230, 100).perform();

		String getPosition = driver.findElement(By.id("resizable")).getAttribute("style");
		if (getPosition.contains("width: 380px; height: 250px")) {
			System.out.println("Box has resized");
		} else {
			System.out.println("Box doesn't resized");
		}
		Thread.sleep(1000);
		driver.quit();
	}
}
