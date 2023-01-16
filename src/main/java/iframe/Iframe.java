package iframe;

/**
 * @author Vasu Dev Upadhyay
 * @Project: Handling Iframe
 * @Date: January 12, 2023
 */

/* Test Case 
* To switch between frames 
* 1. Open URL: https://bluetoad.com/publication/?i=425146&pre=1 
* 2. Switch into parent frame 
* 3. Click on the menu button
* 4. Switch into child frame
* 5. Click on the help option
* 6. Switch into parent frame
* 7. Click on the close icon
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {
	
	
	WebDriver driver;

	public Iframe(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public int  framesize()
	{
		int size = driver.findElements(By.tagName("iframe")).size();
		return size;
	}
	
	//Switching by index
	
	public void switchToParentFrame()
	{
		driver.switchTo().frame(0);
		
	
	}
	
	//Switching by ID
	public void switchToChildFrame()
	{
		driver.switchTo().frame("mainContentIframe");
		
		
		
	}
	
	//Switching by WebElement
//	  WebElement iframeElement = driver.findElement(By.id("viewerFrame"));
//    driver.switchTo().frame(iframeElement); 
    
	public void switchFromChildToParentFrame()
	{
		driver.switchTo().parentFrame();
	}
	
	public void click(String loc)
	{
		driver.findElement(By.xpath(loc)).click();
	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bluetoad.com/publication/?i=425146&pre=1");		
	    
		Iframe IF = new Iframe(driver);
		
		int sz = IF.framesize();
		System.out.println(sz);

	   Thread.sleep(2000);
	   IF.switchToParentFrame();
	   
	   int sz1 = IF.framesize();
		System.out.println(sz1);
	   
	   IF.click("//a[@id='navBtn']");
       Thread.sleep(3000);
       
       IF.switchToChildFrame();
       
       int sz2 = IF.framesize();
		System.out.println(sz2);
		
       Thread.sleep(2000);
       IF.click("//div[@class='title_icon_wrapper' and @placeholder='Help']");
       
       Thread.sleep(2000);
       
       driver.switchTo().parentFrame();
       
       Thread.sleep(2000);
       
       IF.click("//div[@id='tutDialog']//div[@class='closeButton win8button']");
       
       Thread.sleep(3000);
		driver.quit();


	}

}
