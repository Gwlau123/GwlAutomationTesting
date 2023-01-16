package pom_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPage_Runner {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		
		LoginPage_Runner lr = new LoginPage_Runner();
		lr.login_pf(driver);
//		lr.login_pom(driver);
		Thread.sleep(3000);
   		driver.quit();
}
	
	private void login_pf(WebDriver driver) {
		

		LoginTest_PF loginpage = new LoginTest_PF(driver);
		
		driver.get("https://www.saucedemo.com/");
		loginpage.enterusername("standard_user");
		loginpage.enterpassword("secret_sauce");
		loginpage.clickOnLogin();
	}
	
private void login_pom(WebDriver driver) {
 
	LoginTest_POM loginpage = new LoginTest_POM(driver);
	driver.get("https://www.saucedemo.com/");
	loginpage.sendUserName("standard_user");
	loginpage.sendPassword("secret_sauce");
	loginpage.clickBtn();

}	
	

}
