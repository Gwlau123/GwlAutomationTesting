package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Basic {

	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://parabank.parasoft.com/");
   
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("user1");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password1");
   
	}

}
