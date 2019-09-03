package com.rd.epam.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegisterTest {
	@Test
	public void login() {
		Browser browser = Browser.getBrowser();
		WebDriver driver = browser.getDriver();

		driver.get("https://www.flipkart.com");
		Register loginpage = PageFactory.initElements(driver, Register.class);
		loginpage.setEmail("demo@gmail.com");
		loginpage.setPassword("demo1234");
		loginpage.clickOnRegisterButton();
	}
}
