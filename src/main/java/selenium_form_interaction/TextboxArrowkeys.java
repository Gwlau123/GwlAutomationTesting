package selenium_form_interaction;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TextboxArrowkeys {				
    public static void main(String[] args) throws InterruptedException									
    {	
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "https://finmasters.com/money-counter/";					
        driver.get(baseUrl);
        driver.manage().window().maximize();

        // Get the WebElement  		
        WebElement bills1 = driver.findElement(By.name("fieldname2_1"));
        Thread.sleep(3000);
        bills1.sendKeys("9");
        Thread.sleep(3000);
        bills1.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        bills1.sendKeys(Keys.ARROW_DOWN);
        
        // Get the WebElement 	
        WebElement bills2 = driver.findElement(By.name("fieldname3_1"));
        Thread.sleep(3000);
        bills2.sendKeys(Keys.ARROW_UP);
        Thread.sleep(3000);
        bills2.sendKeys(Keys.ARROW_UP);
        
     // Get the WebElement 	
        WebElement bills3 = driver.findElement(By.name("fieldname4_1"));
        Thread.sleep(3000);
        bills3.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        bills3.sendKeys(Keys.ARROW_UP);
        
        // Get the WebElement 	
        WebElement coins = driver.findElement(By.name("fieldname11_1"));
        Thread.sleep(3000);
        coins.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        coins.sendKeys(Keys.ARROW_UP);
    }
}
