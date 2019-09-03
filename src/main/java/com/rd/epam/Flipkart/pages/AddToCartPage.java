package com.rd.epam.Flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.rd.epam.Flipkart.base.TestBase;

public class AddToCartPage extends TestBase {

	@FindBy(how = How.XPATH, using = "//input[@class='_2csFM9']")
	WebElement productCount;
	
	@FindBy(how = How.XPATH, using = "//button[@class='wNrY5O']")
	WebElement increaseQuanitity;
	
	@FindBy(how = How.XPATH, using = "//button[@class='wNrY5O']")
	WebElement decreaseQuanitity;
	

	public AddToCartPage(WebDriver driver) {
		this.driver=driver;

	}

	public int cartSize() {
		return Integer.valueOf(productCount.getAttribute("value"));
	}
	
	public void increaseQuantity() {
		increaseQuanitity.click();
	}
}
