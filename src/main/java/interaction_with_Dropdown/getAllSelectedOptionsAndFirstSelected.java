package interaction_with_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAllSelectedOptionsAndFirstSelected {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String baseUrl = "file:///C:/Users/ashwi/git/GwlAutomationTesting/src/main/java/interaction_with_Dropdown/Result.html";

		driver.get(baseUrl);
		// Selecting the multi-select element by locating its id
		Select select = new Select(driver.findElement(By.id("shuttle")));

		// Using isMultiple() method to verify if the element is multi-select, if yes go
		// onto next step
		if (select.isMultiple()) {

			select.selectByIndex(1);
			Thread.sleep(2000);

			select.selectByValue("C");
			Thread.sleep(2000);

			select.selectByVisibleText("UK");
			Thread.sleep(2000);

			// getAllSelectedOptions

			System.out.println("The selected values in the dropdown options are -");

			List<WebElement> selectedOptions = select.getAllSelectedOptions();

			for (WebElement selectedOption : selectedOptions)
				System.out.println(selectedOption.getText());

			// get 1st selected option
			System.out.println("1st Selected value is: " + select.getFirstSelectedOption().getText());

		}
	}
}
