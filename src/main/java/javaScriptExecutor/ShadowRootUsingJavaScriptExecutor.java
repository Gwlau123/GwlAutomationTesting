package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Test Scenario: Automate Clear data function in Chrome browser

1. Open the Chrome browser
2. Maximize the browser window
3. Navigate to the chrome settings page
4. Click on Privacy and security*/

public class ShadowRootUsingJavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch the application
		driver.get("chrome://settings");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String clickPrivacySafetySelector = "document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#leftMenu\").shadowRoot.querySelector(\"a[href='/privacy']\").click()";
		js.executeScript(clickPrivacySafetySelector);

	}

}
