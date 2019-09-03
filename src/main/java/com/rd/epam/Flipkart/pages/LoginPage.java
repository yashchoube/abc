package com.rd.epam.Flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.rd.epam.Flipkart.AddToCart;
import com.rd.epam.Flipkart.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(how = How.XPATH, using = "//input[@class=\"_2zrpKA _1dBPDZ\"]")
	WebElement emailTextBox;

	@FindBy(how = How.XPATH, using = "//input[@class=\"_2zrpKA _3v41xv _1dBPDZ\"]")
	WebElement passwordTextBox;

	@FindBy(how = How.XPATH, using = "//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")
	WebElement loginButton;
	
	public LoginPage(){
		
		
		PageFactory.initElements(driver, this);

	}
	
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public void setEmail(String strEmail) {
		emailTextBox.clear();
		emailTextBox.sendKeys(strEmail);
	}
	
	public void setPassword(String strPassword) {
		passwordTextBox.clear();
		
		passwordTextBox.sendKeys(strPassword);
	}
	
	public void clickOnLoginButton() {
		
		loginButton.click();
		
	}
	
	public HomePage loginFunction(String userName, String Pass) {
		
		setEmail(userName);
		setPassword(Pass);
		clickOnLoginButton();
		return PageFactory.initElements(driver, HomePage.class);
		//return new HomePage();
		
	}

}
