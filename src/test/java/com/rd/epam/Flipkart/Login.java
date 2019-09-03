package com.rd.epam.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@class=\"_2zrpKA _1dBPDZ\"]")
	WebElement emailTextBox;

	@FindBy(how = How.XPATH, using = "//input[@class=\"_2zrpKA _3v41xv _1dBPDZ\"]")
	WebElement passwordTextBox;

	@FindBy(how = How.XPATH, using = "//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")
	WebElement loginButton;

	public void setEmail(String strEmail) {
		emailTextBox.sendKeys(strEmail);
	}

	public void setPassword(String strPassword) {
		passwordTextBox.sendKeys(strPassword);
	}

	public AddToCart clickOnLoginButton() {
		loginButton.click();
		return new AddToCart(driver);
	}

}
