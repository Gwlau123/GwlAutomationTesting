package interaction_with_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		String baseUrl = "file:///C:/Users/ashwi/git/GwlAutomationTesting/src/main/java/interaction_with_Dropdown/Result.html";
		driver.get(baseUrl);

		// Selecting the multi-select element by locating its id
		Select select = new Select(driver.findElement(By.id("shuttle")));

		// Using isMultiple() method to verify if the element is multi-select, if yes go
		// onto next steps else eit
		if (select.isMultiple()) {

			select.selectByIndex(1);
			select.selectByValue("C");
			select.selectByVisibleText("UK");
			Thread.sleep(3000);

			System.out.println("\nDeSelect the selected option ");
			select.deselectByIndex(1);
			select.deselectByValue("C");
			select.deselectByVisibleText("UK");

			// Again select the option ByValue
			System.out.println("\n Again select option India by Value");
			select.selectByValue("I");

		}
	}

}
