package interaction_with_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeselectAll {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		String baseUrl = "file:///C:/Users/ashwi/git/GwlAutomationTesting/src/main/java/interaction_with_Dropdown/Result.html";
		driver.get(baseUrl);

		// Selecting the multi-select element by locating its id
		Select select = new Select(driver.findElement(By.id("shuttle")));

		select.selectByIndex(1);
		select.selectByValue("C");
		select.selectByVisibleText("USA");
		Thread.sleep(3000);

		// Deselect all values
		System.out.println("\nDeselect all values");
		select.deselectAll();
	}

}
