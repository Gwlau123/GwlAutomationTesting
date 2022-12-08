package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CheckBox_isEnabled {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        		
        String baseUrl = "https://demo.automationtesting.in/Register.html";				
        driver.get(baseUrl);					
		
        //find Checkbox using Xpath and perform click
        WebElement chbox3 = driver.findElement(By.xpath("//Input[@id='checkbox3' and @value = 'Hockey']"));
        System.out.println("Checkbox3: Hockey is Enabled"); 
        Thread.sleep(3000);
        
      
       // isEnabled() Validate checkbox using isEnabled() and then click
        WebElement Chbox3Element = driver.findElement(By.xpath("//Input[@id='checkbox3' and @value = 'Hockey']"));
        boolean selectState = Chbox3Element.isEnabled();
      //To print the value
        System.out.println("Element Enabled is :"+selectState);
      //performing click operation only if element is Enabled
        if(selectState == true) {
        	Chbox3Element.click();
        }
}
}

