package com.rd.epam.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest {

	static Browser browser = Browser.getBrowser();
	static WebDriver driver = browser.getDriver();
	AddToCart addToCart;
	@Test(priority=0)
	public void login() {
		
		driver.navigate().to("https://www.flipkart.com");
		Login loginpage = PageFactory.initElements(driver, Login.class);
		loginpage.setEmail("jaideepkurapati@gmail.com");
		loginpage.setPassword("123abc");
		loginpage.clickOnLoginButton();
		AddToCart addToCart=PageFactory.initElements(driver, AddToCart.class);
		addToCart.setSearchBar("nokia mobile");
//		addToCart.clickOnSearchButton();
	}
}
