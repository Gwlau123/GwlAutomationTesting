package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RadioButton_isEnabled {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        		
        String baseUrl = "https://demo.automationtesting.in/Register.html";				
        driver.get(baseUrl);					
		
        //find RadioButton using Xpath and perform click
        WebElement RBF = driver.findElement(By.xpath("//Input[@name='radiooptions' and @value = 'FeMale']"));
        RBF.click(); 
        System.out.println("Female RadioButton is Enabled"); 
        Thread.sleep(3000);
      
        // dselect RadioButton
        WebElement RBM = driver.findElement(By.xpath("//Input[@name='radiooptions' and @value = 'Male']"));
        RBM.click(); 
        System.out.println("Male RadioButton is Enabled"); 
        Thread.sleep(3000);
        
      //isEnabled()". This method validates if the given web element is enabled or not. This method will return the boolean value based on the status of the element. It will return 'true' if the element is enabled and 'false ' if it's not enabled.
        WebElement radioElement = driver.findElement(By.xpath("//Input[@name='radiooptions' and @value = 'Male']"));
        boolean selectState = radioElement.isEnabled();
      //To print the value
        System.out.println("Element enabled is :"+selectState);
      //performing click operation only if element is not Enabled
        if(selectState == false) {
        	radioElement.click();
        }
}
}

