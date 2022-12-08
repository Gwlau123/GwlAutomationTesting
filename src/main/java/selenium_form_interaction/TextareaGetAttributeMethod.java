package selenium_form_interaction;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;		

public class TextareaGetAttributeMethod {

    public static void main(String[] args) throws InterruptedException {									
    		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "file:///C:/Users/Administrator/Downloads/Result.html";					
        driver.get(baseUrl);					
		
        //Fetching the placeholder value
	    WebElement textarea = driver.findElement(By.id("txtar"));
	    
	    String placeholderVal = textarea.getAttribute("value");
	    String expectedVal = "PREEXISTING VALUE"; 
	    {
	     if(placeholderVal.equalsIgnoreCase(expectedVal))
     	   System.out.println("The placeholder value is expected, ie : "+placeholderVal);
	     else
     	   System.out.println("The placeholder value is not correct --- " +placeholderVal);
	    }
	         }
    }
