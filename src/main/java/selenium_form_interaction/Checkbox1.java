package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Checkbox1 {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        		
        String baseUrl = "https://demo.automationtesting.in/Register.html";				
        driver.get(baseUrl);					
		
        //find Checkbox1 using Xpath and perform click
        WebElement chbox1 = driver.findElement(By.xpath("//Input[@id='checkbox1' and @value = 'Cricket']"));
        chbox1.click(); 
        System.out.println("Checkbox1: Cricket is Checked"); 
        Thread.sleep(3000);
        
      //find Checkbox2 using Xpath and perform click
        WebElement chbox2 = driver.findElement(By.xpath("//Input[@id='checkbox2' and @value = 'Movies']"));
        chbox2.click(); 
        System.out.println("Checkbox2: Movies is Checked"); 
        Thread.sleep(3000);
        
      //find Checkbox3 using Xpath and perform click
        WebElement chbox3 = driver.findElement(By.xpath("//Input[@id='checkbox3' and @value = 'Hockey']"));
        chbox3.click(); 
        System.out.println("Checkbox3: Hockey is Checked"); 
        Thread.sleep(3000);
      
        // Uncheck Checkbox
        WebElement checkbox3 = driver.findElement(By.xpath("//Input[@id='checkbox3' and @value = 'Hockey']"));
        checkbox3.click(); 
        System.out.println("Checkbox3: Hockey is unchecked"); 
        Thread.sleep(3000);
        
      
	}
	}
        
      /*// By pressing "Tab key", how to click on button
        driver.findElement(By.id("Button1")).sendKeys(Keys.TAB);
        Thread.sleep(3000);
        driver.findElement(By.id("Button1")).sendKeys(Keys.ENTER);*/
        

