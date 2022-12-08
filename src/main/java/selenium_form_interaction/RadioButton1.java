package selenium_form_interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RadioButton1 {
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
    	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");					
        //WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
		 WebDriverManager.chromedriver().setup();
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
        
       //isDisplayed() method returns boolean value either True or False
        Boolean Display = driver.findElement(By.xpath("//Input[@name='radiooptions' and @value = 'Male']")).isDisplayed();
        Thread.sleep(3000);
        //To print the value
        System.out.println("Element displayed is :"+Display);
        
      //isEnabled() method returns boolean value either True or False 
        Boolean Enable = driver.findElement(By.xpath("//Input[@name='radiooptions' and @value = 'Male']")).isEnabled();
      //To print the value
        System.out.println("Element enabled is :"+Enable);
        
      //isSelected() method returns boolean value either True or False
        Boolean Select = driver.findElement(By.xpath("//Input[@name='radiooptions' and @value = 'Male']")).isSelected();
      //To print the value
        System.out.println("Element selected is :"+Select);
        
        
	}
	}
        
      /*// By pressing "Tab key", how to click on button
        driver.findElement(By.id("Button1")).sendKeys(Keys.TAB);
        Thread.sleep(3000);
        driver.findElement(By.id("Button1")).sendKeys(Keys.ENTER);*/
        

