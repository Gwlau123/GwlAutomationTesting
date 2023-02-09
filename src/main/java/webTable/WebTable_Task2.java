package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Task2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Web table Test case -Find the Country of Adobe using Webelement
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		// no. of row
		List<WebElement> row = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println("Number of row are " + row.size());

		String gRowValue = "Google";

		// First loop will find the Company name in the first column
		for (int i = 2; i <= row.size(); i++) {
			String sValue = null;
			sValue = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/td")).getText();

			if (sValue.equalsIgnoreCase(gRowValue)) {
				System.out.println("Company country is Match ");
			} else {
				System.out.println("Company country is Not match");
				break;
			}
			{
				String sColumnValue = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/td[3]"))
						.getText();
				System.out.println(sColumnValue);

			}
			break;
		}
		driver.close();
	}

}
