package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBox_isDisplayed {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        		
        String baseUrl = "https://demo.automationtesting.in/Register.html";				
        driver.get(baseUrl);					
		
        //find Checkbox using Xpath and perform click
        WebElement chbox1 = driver.findElement(By.xpath("//Input[@id='checkbox1' and @value = 'Cricket']"));
        System.out.println("Checkbox1: Cricket is Displayed"); 
        Thread.sleep(3000);
        
      
       // isDisplayed() validate if a given checkbox displays or not.
        WebElement Chbox1Element = driver.findElement(By.xpath("//Input[@id='checkbox1' and @value = 'Cricket']"));
        boolean selectState = Chbox1Element.isDisplayed();
      //To print the value
        System.out.println("Element Dislpay is :"+selectState);
      //performing click operation only if element is Displayed
        if(selectState == true) {
        	Chbox1Element.click();
        }
}
}

