package selenium_form_interaction;
//For getting the label text we use getText method.This method returns a string value.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class label1 {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "file:///C:/Users/Administrator/Downloads/Result.html";					
        driver.get(baseUrl);					
		
        //find element by  
      driver.findElement(By.xpath("//h3[.='WAITS PRACTICE']"));
      
        // text from lable1
       String textvalue = driver.findElement(By.xpath("//h3[.='WAITS PRACTICE']")).getText();
        //To print the value
       System.out.println("gettextvalue is :"+textvalue);
      
      
       //isDisplayed() method returns boolean value either True or False
        Boolean Display = driver.findElement(By.xpath("//h3[.='WAITS PRACTICE']")).isDisplayed();
        Thread.sleep(3000);
        //To print the value
        System.out.println("Element displayed is :"+Display);
	}
}