package selenium_form_interaction;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;		

public class Textarea1 {

    public static void main(String[] args) throws InterruptedException {									
    		
    	// declaration and instantiation of objects/variables		
    	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
    	//WebDriverManager.chromedriver().setup();
    	//WebDriver driver = new ChromeDriver();	

    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        		
        String baseUrl = "file:///C:/Users/Administrator/Downloads/Result.html";					
        driver.get(baseUrl);					
		
        //find element by id 
        driver.findElement(By.id("txtar"));
        
        // click action
        driver.findElement(By.id("txtar")).click();
        Thread.sleep(3000);
        
        // clear the previous text
        driver.findElement(By.id("txtar")).clear(); 
        
        // keyboard action to delete data
        //driver.findElement(By.id("txtar")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
        //driver.findElement(By.id("txtar")).sendKeys("Meemansa",Keys.chord(Keys.ALT),Keys.ENTER,"Pathak");
        
        // new text
        driver.findElement(By.id("txtar")).sendKeys("abcdefghijklmnopqurstuvwxyzabcdefghijklmnopqurstuvwxyzabcdefghijklmnopqurstuvwxyzabcdefghijklmnopqurstuvwxyzabcdefghijklmnopqurstuvwxyzabcdefghijklmnopqurstuvwxyz");
        
        //To get the text present in textarea use getText method. It returns String value.
		 //String textvalue = driver.findElement(By.id("txtar")).getText();
		//To print the value
		 //System.out.println("gettextvalue is :"+textvalue);
    }
   
}


