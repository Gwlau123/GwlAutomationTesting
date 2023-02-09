package exceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementexcpt {
	/*
	 * The stale element reference error is a WebDriver error that occurs because
	 * the referenced web element is no longer attached to the DOM.
	 * 
	 * To handle this exception, you can either use Dynamic Xpath for handling DOM
	 * operations or try to use the Page Factory Model or try to access the element
	 * in loops before throwing the exception.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");
		// Locate the search text box
		WebElement ele = driver.findElement(By.xpath("//input[@title='Search']"));

		// Refresh the web page
		driver.navigate().refresh();
	//	ele.sendKeys("Testing String");

		// avoid StaleElementReferenceException using try catch
		try {
			// Pass string using sendkeys to the web element
			ele.sendKeys("Testing String");
		} catch (StaleElementReferenceException e) {
			WebElement elem = driver.findElement(By.xpath("//input[@title='Search']"));
			elem.sendKeys("Testing String from catch block");
			// Fetching the string entered in the search text box
			String str = elem.getAttribute("value");
			System.out.println("The string entered from catch block is - " + str);
		}

	}

}
