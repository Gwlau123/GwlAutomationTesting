package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Relative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		   //Dynamic Xpath using [starts-with and ends-with] when having multiple values for any attribute
		    driver.get("https://dieselbarbershop-stg.unchainedsystems.com/admin");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("storeowner@yopmail.com");
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Amplify@123");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@type='submit' and span='Log in']")).click();
		 //  htlmtag[starts-with(@attribute, 'value')]  --- start with xpath (ex: <iframe id = "google_ostc_static_frame_12345"></iframe>, <iframe id = "google_ostc_static_frame_789654" )
		   // driver.findElement(By.xpath("//iframe[starts-with(@id,'google_ostc_static_frame_')]"));
		    
		    // htmltag[ends-with(@attribute, 'value')]  --- ends with xpath (ex: iframe id = "12345_google_ostc_static_frame", iframe id = "789654_google_ostc_static_frame" )
		  //  driver.findElement(By.xpath("//iframe[ends-with(@id,'google_ostc_static_frame_')]"));
			}

	}


