package interaction_with_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectbyIndex {


	
	public static void main (String [] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      
        String baseUrl = "file:///C:/Users/ashwi/git/GwlAutomationTesting/src/main/java/interaction_with_Dropdown/Result.html";				
        driver.get(baseUrl);
      
        // Selecting the dropdown element by locating its id
      WebElement drobdownobj=driver.findElement(By.id("single"));
      
      Select select = new Select(drobdownobj);

        // Selecting the option as 'USA'-- selectByIndex
           select.selectByIndex(3);
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
        
      
	}
}
