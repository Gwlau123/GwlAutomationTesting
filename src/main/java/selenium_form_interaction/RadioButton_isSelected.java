package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton_isSelected {
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
        System.out.println("Female RadioButton is selected"); 
        Thread.sleep(3000);
      
        // dselect RadioButton
        WebElement RBM = driver.findElement(By.xpath("//Input[@name='radiooptions' and @value = 'Male']"));
        RBM.click(); 
        System.out.println("Male RadioButton is selected"); 
        Thread.sleep(3000);
        
      //isSelected() method is used to validate the current state of the radio button, whether it is selected or not. We can use it both in pre and post validation.
        WebElement radioElement = driver.findElement(By.xpath("//Input[@name='radiooptions' and @value = 'Male']"));
        boolean selectState = radioElement.isSelected();
      //To print the value
        System.out.println("Element selected is :"+selectState);
      //performing click operation only if element is not selected
        if(selectState == false) {
        	radioElement.click();
        }
}
}

