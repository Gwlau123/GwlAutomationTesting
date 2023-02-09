package interaction_with_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class customDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		String baseUrl = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		driver.get(baseUrl);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='custom']")).click();

		List<WebElement> dropdownListing = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//li"));

		System.out.println("The Custom Dropdown list size is ::" + dropdownListing.size());

	}

}
