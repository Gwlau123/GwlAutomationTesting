package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(Constants.DRIVER_BROWSER, Constants.BROWSER_PATH);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("D:\\Githubworkspace\\GwlAutomationTesting\\configs\\index.html");
		ArrayList<WebElement> PMPageCMList =  (ArrayList<WebElement>) driver
				.findElements(By.xpath("//i[contains(@class,'fa-user')]/following-sibling::span"));
//				.stream()
//				.map(user -> user.getAttribute("innerText")).collect(Collectors.toList());
		for (int i = 0; i < PMPageCMList.size(); i++) {
			System.out.println(PMPageCMList.get(i));
		}
	}
}
