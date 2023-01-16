package pom_pagefactory;

/**
 * @author Vasu Dev Upadhyay
 * @Project: Page Factory
 * @Date: January 12, 2023
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Page object modal with page factory

public class LoginTest_PF {

	@FindBy(id="user-name") private WebElement txt_username;
	
	
	@FindBy(id="password")
	private WebElement txt_password;
	
	@FindBy(id="login-button")
	private WebElement btn_login;
	

	
	public LoginTest_PF(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		btn_login.click();
	}
	
}
