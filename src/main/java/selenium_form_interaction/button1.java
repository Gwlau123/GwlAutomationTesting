package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class button1 {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        		
        String baseUrl = "https://demo.automationtesting.in/Register.html";					
        driver.get(baseUrl);					
		
        //click signup button
        driver.findElement(By.name("signup")).click();
        Thread.sleep(3000);
        
        //click Refresh button 
        driver.findElement(By.id("Button1")).click();
        Thread.sleep(3000);
        
       //isDisplayed() method returns boolean value either True or False
        Boolean Display = driver.findElement(By.id("Button1")).isDisplayed();
        Thread.sleep(3000);
        //To print the value
        System.out.println("Element displayed is :"+Display);
        
      //isEnabled() method returns boolean value either True or False 
        Boolean Enable = driver.findElement(By.name("signup")).isEnabled();
      //To print the value
        System.out.println("Element enabled is :"+Enable);
        
      //isSelected() method returns boolean value either True or False
        Boolean Select = driver.findElement(By.name("signup")).isSelected();
      //To print the value
        System.out.println("Element selected is :"+Select);
        
        // get text from button
       String textvalue = driver.findElement(By.id("Button1")).getText();
      //To print the value
       System.out.println("gettextvalue is :"+textvalue);
        
      // By pressing "Tab key", how to click on button
        driver.findElement(By.id("Button1")).sendKeys(Keys.TAB);
       Thread.sleep(3000);
       driver.findElement(By.id("Button1")).sendKeys(Keys.ENTER);
        
	}
}
