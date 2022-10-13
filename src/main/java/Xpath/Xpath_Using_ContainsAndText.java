package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Using_ContainsAndText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
	 
	    
	   
	    driver.get("https://dieselbarbershop-stg.unchainedsystems.com/admin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("storeowner@yopmail.com");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Amplify@123");
	    
	  //syntax for text() : //htmltag[text()='value of text']
	    driver.findElement(By.xpath("//input[text() ='Appointments']")).click();
	    
	    //synatx for contains : //htmltag[contains text(), 'value of text')]
	    
	// or  //htmltag[contains(@attribute, 'value')]
		}

}
