package selenium_form_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Link {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "https://www.facebook.com/";					
        driver.get(baseUrl);	
        
        driver.findElement(By.id("email")).sendKeys("Meemansa",Keys.TAB);
	    driver.switchTo().activeElement().sendKeys("Pathak",Keys.TAB,Keys.TAB);
		driver.switchTo().activeElement().click();
		
        //find link by Xpath and perform click on the link
        //driver.findElement(By.xpath("//a[text()= 'Forgotten password?']")).click();
      
 }
}