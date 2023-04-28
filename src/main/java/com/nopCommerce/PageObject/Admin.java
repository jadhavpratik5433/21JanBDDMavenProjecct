package com.nopCommerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
	
	
	public WebDriver ldriver;
	
      
	public Admin(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement txtpassword;
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement btnLogin;
	
	public void setUsername(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
		
	}
	public void setPassword(String pwd) {
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
		
	}
	public void clickLogin() {
		btnLogin.click();
	}
	
	
	
}
