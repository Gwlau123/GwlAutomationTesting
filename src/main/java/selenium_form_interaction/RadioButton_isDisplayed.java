package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton_isDisplayed {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        		
        String baseUrl = "https://demo.automationtesting.in/Register.html";				
        driver.get(baseUrl);					
		
        //find RadioButton using Xpath and perform click
        WebElement RBF = driver.findElement(By.xpath("//Input[@name='radiooptions' and @value = 'FeMale']"));
        RBF.click(); 
        System.out.println("Female RadioButton is displaye"); 
        Thread.sleep(3000);
        
       //validate if a given radio button displays or not. If displayed, then we will click and select the radio button.
        WebElement radioElement = driver.findElement(By.xpath("//Input[@name='radiooptions' and @value = 'Male']"));
        boolean selectState = radioElement.isDisplayed();
       //To print the value
        System.out.println("Element displayed is :"+selectState);
      //performing click operation only if element is not Displayed
        if(selectState == false) {
        	radioElement.click();
        }
	}
}
        
      

        
      
        
        
	
	
        
      
        


