package selenium_form_interaction;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.openqa.selenium.*;		

public class TextboxDeleteData {				
    public static void main(String[] args) {									
    		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "http://demo.guru99.com/test/login.html";					
        driver.get(baseUrl);					

        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement email = driver.findElement(By.id("email"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement password = driver.findElement(By.name("passwd"));							

        email.sendKeys("abcd@gmail.com");					
        password.sendKeys("abcdefghlkjl");					
        //System.out.println("Text Field Set");					
         
        // Deleting values in the text box		
        email.clear();			
        password.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);		
       // System.out.println("Text Field Cleared");	
    }
}
