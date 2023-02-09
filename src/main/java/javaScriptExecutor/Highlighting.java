package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Highlighting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		// Finding an element using Javascript and highlighting it.
		String javascript = "document.getElementById('email').style.border='2px solid red'";
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript(javascript);

		Highlighting hig = new Highlighting();
		hig.highlightObject(By.id("pass"), driver);
		hig.highlightObject(By.name("login"), driver);
		hig.highlightObject(By.linkText("Forgotten password?"), driver);

	}

	private void highlightObject(By obj, WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement passTxt = driver.findElement(obj);
		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
		jsExecutor1.executeScript(
				"arguments[0].style.border='2px solid green';arguments[0].style.background='yellow';arguments[0].style.color='pink';",
				passTxt);

	}
}
