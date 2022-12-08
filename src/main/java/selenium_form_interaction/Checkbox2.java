package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Checkbox2 {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        		
        String baseUrl = "file:///C:/Users/Administrator/Downloads/Result.html";				
        driver.get(baseUrl);					
		
        //find Checkbox using Xpath
        WebElement Red = driver.findElement(By.xpath("//input[@value='Red']")); 
        Red.click(); 
       System.out.println("Red Checkbox is selected"); 
     
       WebElement Blue = driver.findElement(By.xpath("//input[@value='Blue']")); 
        Blue.click(); 
       System.out.println("Blue Checkbox is selected"); 

	}
}