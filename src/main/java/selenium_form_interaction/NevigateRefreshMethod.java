package selenium_form_interaction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NevigateRefreshMethod {
public static void main(String args[]) throws InterruptedException
{
//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
driver.navigate().refresh();
driver.close();
}
}

