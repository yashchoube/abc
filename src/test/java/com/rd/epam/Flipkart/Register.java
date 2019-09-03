package com.rd.epam.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Register {
	WebDriver driver;

	public Register(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@class=\"_2zrpKA _1dBPDZ\"]")
	WebElement emailTextBox;
	
	@FindBy(how = How.XPATH, using = "// input[@class=\"_2zrpKA _1dBPDZ\"]")
	WebElement mobileNumberTextBox;

	@FindBy(how = How.XPATH, using = "//a[@class=\"oZoRPi\"]")
	WebElement goToRegistration;

	@FindBy(how = How.XPATH, using = "//input[@class=\"_2zrpKA _3v41xv _1dBPDZ\"]")
	WebElement passwordTextBox;

	@FindBy(how = How.XPATH, using = "//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")
	WebElement registerButton;

	public void setEmail(String strEmail) {
		emailTextBox.sendKeys(strEmail);
	}
	
	public void setMobileNumber(String strMobile) {
		mobileNumberTextBox.sendKeys(strMobile);
	}

	public void setPassword(String strPassword) {
		passwordTextBox.sendKeys(strPassword);
	}

	public void goToRegistration() {
		goToRegistration.click();
	}

	public void clickOnRegisterButton() {
		registerButton.click();
	}

}
