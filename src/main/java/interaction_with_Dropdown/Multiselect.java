package interaction_with_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String baseUrl = "file:///C:/Users/ashwi/git/GwlAutomationTesting/src/main/java/interaction_with_Dropdown/Result.html";

		driver.get(baseUrl);
		// Selecting the multi-select element by locating its id
		Select select = new Select(driver.findElement(By.id("shuttle")));

		// Using isMultiple() method to verify if the element is multi-select, if yes go
		// onto next steps else eit
		if (select.isMultiple()) {

			System.out.println("Select option 'India' by Index");
			select.selectByIndex(1);
			Thread.sleep(3000);

			System.out.println("Select option 'Croatia' by Value");
			select.selectByValue("C");
			Thread.sleep(3000);

			System.out.println("Select option 'UK' by Text");
			select.selectByVisibleText("UK");
			Thread.sleep(3000);

		}
	}
}
