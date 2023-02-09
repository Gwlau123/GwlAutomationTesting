package exceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 Happens when the locators are unable to find or access elements on the web page or application.
		 Ideally, the exception occurs due to the use of incorrect element locators in the findElement(By, by) method.

		To handle this exception, use the wait command. Use Try/Catch to ensure that the program flow 
		is interrupted if the wait command doesn’t help.	 */
		 
	

		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	  
	    Thread.sleep(3000);
	        
	    String baseUrl = "file:///C:/Users/ashwi/git/GwlAutomationTesting/src/main/java/interaction_with_Dropdown/Result.html";				
	    driver.get(baseUrl);
	    driver.findElement(By.id("shuttle"));
						        
	}

}
