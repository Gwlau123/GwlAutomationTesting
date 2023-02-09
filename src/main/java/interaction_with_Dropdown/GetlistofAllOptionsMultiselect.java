package interaction_with_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetlistofAllOptionsMultiselect {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      
        Thread.sleep(3000);
        String baseUrl = "file:///C:/Users/ashwi/git/GwlAutomationTesting/src/main/java/interaction_with_Dropdown/Result.html";				
        driver.get(baseUrl);
        
      //Selecting the multi-select element by locating its id
        Select select = new Select(driver.findElement(By.id("shuttle")));

        //Get the list of all options
        System.out.println("The dropdown options are -");

        List<WebElement> options = select.getOptions();
        for(WebElement option: options)
        System.out.println(option.getText());
	
		}

}
