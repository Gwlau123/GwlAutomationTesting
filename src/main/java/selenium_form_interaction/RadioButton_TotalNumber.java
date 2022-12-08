package selenium_form_interaction;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RadioButton_TotalNumber {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        		
        String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";				
        driver.get(baseUrl);					
		
        // identifying the radio buttons with type attribute in a list
        List <WebElement> chk =driver.findElements(By.xpath("//input[@type='radio']"));
       System.out.println("Total RadioButtons :"+chk.size());
       
}
}
