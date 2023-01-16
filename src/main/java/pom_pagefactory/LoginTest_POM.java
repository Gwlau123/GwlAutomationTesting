package pom_pagefactory;

/**
 * @author Vasu Dev Upadhyay
 * @Project: Page object modal
 * @Date: January 12, 2023
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Page object modal

public class LoginTest_POM {
	
WebDriver driver;
	
	public LoginTest_POM(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By submit = By.id("login-button");
	
	public void sendUserName(String name)
	{
		driver.findElement(username).sendKeys(name);
	}
   
	public void sendPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickBtn()
	{
		driver.findElement(submit).click();
	}

}
