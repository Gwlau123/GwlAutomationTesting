package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");

		Scroll s = new Scroll();
		s.scrollObject(By.xpath("//input[@placeholder='Enter Email']"), driver);
	}

	private void scrollObject(By obj, WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement m = driver.findElement(obj);
		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
		jsExecutor1.executeScript("window.scrollBy(0,1200)");
		jsExecutor1.executeScript("arguments[0].scrollIntoView(true);", m);
		Thread.sleep(3000);
		jsExecutor1.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}
}
