package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

/*by Maven Dependency
  <dependency>
<groupId>io.github.sukgu</groupId>
<artifactId>automation</artifactId>
<version>0.1.3</version>
</dependency> 

  Test Scenario: Automate Clear data function in Chrome browser

1. Open the Chrome browser
2. Maximize the browser window
3. Navigate to the chrome settings page
4. Click on Privacy and security
5. Click on Clear browsing data
6. Click on clear data
*/

public class ShadowRoot1byMavenDependency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("chrome://settings");

		Shadow shadow = new Shadow(driver);

	//	WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Privacy and security')]"));
	//	 ele.click();

		shadow.findElementByXPath("//a[contains(text(),'Privacy and security')]").click();
		shadow.findElementByXPath("//div[contains(text(),'Clear browsing data')]").click();
		shadow.findElementByXPath("//cr-button[contains(text(),'Clear data')]").click();
	}

}
