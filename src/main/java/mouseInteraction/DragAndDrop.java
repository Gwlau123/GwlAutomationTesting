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
 * Verify drag and drop working or not 
 * 1. Open URL 
 * 2. Drag the 'Drag me to my Target' box 
 * 3. Drop the element at 'Drop here' box 
 * 4. Verify element is successfully dragged and dropped
 */

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// opens safari browser
		WebDriverManager.safaridriver().setup();
		SafariDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");	
		
		//As element is in a iFrame so we need to switch to that frame
		WebElement frame = driver.findElement(By.xpath("//div[@id='content']//iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);

		//First identify the element to be drag 
		WebElement elementToDrag = driver.findElement(By.id("draggable"));
		
		//Then identify the location where to drop the element
		WebElement locationToDrop = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		Thread.sleep(2000);

		/**
		 * dragAndDrop​(WebElement source, WebElement target) method performs
		 * click-and-hold at the location of the source element moves to the location of
		 * the target element then releases the mouse.
		 */
		action.dragAndDrop(elementToDrag, locationToDrop).perform();
		
		String text = locationToDrop.getText();
		if(text.contains("Dropped")) {
			System.out.println("element dropped");
		} else {
			System.out.println("element not dropped");
		}

		Thread.sleep(2000);
		driver.quit();
	}

}
