package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver1) {
		this.driver = driver1;
	}

	@FindBy(xpath = "//a[text()='Login']")	WebElement loginPage;
	
	@FindBy(name = "email") WebElement uname;
	
	@FindBy(name = "password") WebElement pass;
	
	@FindBy(xpath = "//div[text()='Login']")	WebElement loginbutton;

	public void loginToCRM(String usernameapp, String passwordapp) {
		
		loginPage.click();
		
		uname.sendKeys(usernameapp);
		
		pass.sendKeys(passwordapp);
		
		loginbutton.click();
	}
}
