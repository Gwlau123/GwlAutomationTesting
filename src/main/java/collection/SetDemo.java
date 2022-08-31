package collection;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(Constants.DRIVER_BROWSER,Constants.BROWSER_PATH);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("TESTINg");
		element.submit();
		
		String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		WebElement element2 = driver.findElement(By.partialLinkText("Software testing - Wikipedia"));
		element2.sendKeys(newTab);
		
		String firstTab = driver.getWindowHandle();
		System.out.println("firstTab ============= "+firstTab);

		Set<String> tabSet = driver.getWindowHandles();

		for (String obj : tabSet) {
			if (!obj.equals(firstTab)) {
				driver.switchTo().window(obj);
			}
		}
	}
}
