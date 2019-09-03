package com.rd.epam.Flipkart;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class AddToCartTest {
	@Test(priority=1)
	public void addToCart() throws InterruptedException {
		Browser browser = Browser.getBrowser();
		WebDriver driver = browser.getDriver();
		
		driver.navigate().to("https://www.flipkart.com/search");
		AddToCart add=PageFactory.initElements(driver, AddToCart.class);
//		
		add.setSearchBar("canon 200d");
		add.clickOnSearchButton();
		//add.aa();
//		driver.navigate().to("https://www.flipkart.com/canon-eos-200d-dslr-camera-body-dual-lens-ef-s18-55-stm-ef-s-55-250-16-gb-sd-card-bag/p/itmewhqztfphvkzg?pid=DLLEWHQZHG5GJQ3G&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_5&otracker1=AS_QueryStore_OrganicAutoSuggest_1_5&lid=LSTDLLEWHQZHG5GJQ3GZWNUXG&fm=SEARCH&iid=8b542144-a41a-4e05-b6ff-6a5815f92d11.DLLEWHQZHG5GJQ3G.SEARCH&ppt=sp&ppn=sp&ssid=k0c2ohasjk0000001566912362935&qH=80d73246ad1e37cd");
//		AddToCart add1=PageFactory.initElements(driver, AddToCart.class);
		
		add.clickOnProduct();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		add.clickOnAddToCartButton();
	
	}
}
