package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CheckBox_isSelected {
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
        WebElement chbox2 = driver.findElement(By.xpath("//Input[@id='checkbox2' and @value = 'Movies']"));
        chbox2.click(); 
        System.out.println("Checkbox2: Movies is selected"); 
        Thread.sleep(3000);
        
      
       // isSelected() method to validate the current state of the checkbox, whether we selected it or not.
        WebElement Chbox2Element = driver.findElement(By.xpath("//Input[@id='checkbox2' and @value = 'Movies']"));
        boolean selectState = Chbox2Element.isSelected();
      //To print the value
        System.out.println("Element selected is :"+selectState);
      //performing click operation only if element is not selected
        if(selectState == false) {
        	Chbox2Element.click();
        }
}
}

