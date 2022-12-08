package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TabKeyAction {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "file:///C:/Users/Administrator/Downloads/Result.html";					
        driver.get(baseUrl);					
		
        //find element by id 
        driver.findElement(By.id("txtar"));
        Thread.sleep(3000);
        
        // clear the previous text
        driver.findElement(By.id("txtar")).clear(); 
        Thread.sleep(3000);
        
        // new text
        driver.findElement(By.id("txtar")).sendKeys("meemansa",Keys.TAB);
 }
}