package exceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNotInteractableException {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
	  
        Thread.sleep(3000);
        String baseUrl = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
        driver.get(baseUrl);
        Thread.sleep(3000);
	 		driver.findElement(By.xpath("//button[@id='custom']")).click();
	 				 
	 	//	driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div[1]/div[2]/div/ul")).click();

	}

}
