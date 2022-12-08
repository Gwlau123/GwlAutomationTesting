package selenium_form_interaction;
import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;   
    
   public class Navigation_command { 
	   public static void main(String[] args) throws Exception {
	      System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
                
            // Launch WebSite    
            driver.navigate().to("https://www.facebook.com/");     
  
            //Click on the Link Text using click() command    
            driver.findElement(By.linkText("Forgotten password?")).click();  
            Thread.sleep(3000);
            
            //Go back to Home Page  
            driver.navigate().back();   
  
            //Go forward to Registration page  
            driver.navigate().forward();  
  
            // Go back to Home page  
            driver.navigate().to("https://www.facebook.com/");  
  
            //Refresh browser
            driver.navigate().refresh();  
        
            //Closing browser  
            driver.close();   
    }  
}  
