package gGRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability(CapabilityType.PLATFORM_NAME, "Windows 11");

		WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.2:4444"), cap);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Grid in Selenium");
		System.out.println("Test is excuted successfully");
	}

}
