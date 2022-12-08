package selenium_form_interaction;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBox_TotalNumber {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        		
        String baseUrl = "https://demo.automationtesting.in/Register.html";				
        driver.get(baseUrl);					
		
        // identifying the Checkbox with type attribute in a list
        List <WebElement> chk =driver.findElements(By.xpath("//input[@type='checkbox']"));
       System.out.println("Total Checkbox :"+chk.size());
       
}
}
