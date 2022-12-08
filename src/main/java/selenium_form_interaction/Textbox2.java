package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Textbox2 {				
    public static void main(String[] args) throws InterruptedException {									
    		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "http://demo.guru99.com/test/login.html";					
        driver.get(baseUrl);					

        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement email = driver.findElement(By.id("email"));
        Thread.sleep(3000);
        email.sendKeys("Meemansa@gmail.com",Keys.TAB);
        
        // Get the WebElement corresponding to the Password Field		
        WebElement password = driver.findElement(By.name("passwd"));
        Thread.sleep(3000);
        password.sendKeys("meemansa",Keys.TAB);
     
    }
    
}     
    