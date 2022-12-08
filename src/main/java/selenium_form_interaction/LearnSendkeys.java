package selenium_form_interaction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSendkeys{

	public static void main(String[] args) throws Exception {
	
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	      // Launch WebSite
		//driver.get("https://demo.automationtesting.in/Register.html");	
		//Thread.sleep(3000);
		driver.navigate().to("https://demo.automationtesting.in/Index.html");
		Thread.sleep(3000);
		
		 //Refresh browser
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		 //Go back to Home Page
		driver.navigate().back();
		Thread.sleep(3000);
		
		 //Go forward to Registration page
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//TO get the current URL and print URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		
		//TO get the page Title
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		 //Closing browser window
		driver.close();
		Thread.sleep(3000);
		
		//Closed all the windows and end the session
		driver.quit(); 
	}
}
