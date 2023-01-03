package mouseInteraction;

/**
 * @author Varsha Narwaria
 * @Project: Interaction with Mouse 
 * @Date: December 26, 2022
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPaste {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
		//Actions action = new Actions(driver);
		//action.doubleClick(email).perform();
		email.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		email.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		
		WebElement pswd =driver.findElement(By.id("passwd"));
		pswd.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
