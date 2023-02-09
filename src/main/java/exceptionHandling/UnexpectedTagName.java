package exceptionHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnexpectedTagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		String baseUrl = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		driver.get(baseUrl);
		Thread.sleep(3000);

		/* UnexpectedTagNameException */
// Select select = new Select(driver.findElement(By.xpath("//button[@id='custom']")));

		/* how to resolve UnexpectedTagNameException */

		driver.findElement(By.xpath("//button[@id='custom']")).click();

		List<WebElement> dropdownListing = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//li"));

		System.out.println("The size Custom Dropdown list is ::" + dropdownListing.size());

	}

}
