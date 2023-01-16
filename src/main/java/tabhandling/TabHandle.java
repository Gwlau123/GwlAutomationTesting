package tabhandling;

/**
 * @author Vasu Dev Upadhyay
 * @Project: Handling Tabs
 * @Date: January 12, 2023
 */

/* Test Case 
* To switch between Tabs 
* 1. Open URL: https://www.salesforce.com/in/ 
* 2. Click on the Free Trial button 
* 3. Switch into child frame.
* 4. Fill the fields
* 5. Switch into parent frame.

*/

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabHandle {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/");
		driver.findElement(By.xpath("//div[@class='margin-0-top-lg margin-0-bottom-lg text-left ']/div[1]/div[1]/a")).click();
		
		
		Set <String> windowhandle = driver.getWindowHandles();
		System.out.println(windowhandle);
		
		Iterator <String> iterator = windowhandle.iterator();
		String parent = iterator.next();
		System.out.println("\n" +parent);
		
		String child  = iterator.next();
		System.out.println("\n" +child);
		
		driver.switchTo().window(child);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.name("UserLastName")).sendKeys("test");
		
		driver.close();
		
		driver.switchTo().window(parent);

        Thread.sleep(2000);

		driver.quit();        
		
	}

}
