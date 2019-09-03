package com.rd.epam.Flipkart.testCases;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rd.epam.Flipkart.base.TestBase;
import com.rd.epam.Flipkart.pages.AddToCartPage;
import com.rd.epam.Flipkart.pages.LoginPage;
import com.rd.epam.Flipkart.pages.ProductPage;
import com.rd.epam.Flipkart.pages.SearchPage;
import com.rd.epam.Flipkart.pages.SearchResultsPage;

public class AddToCartPageTest extends TestBase {
	AddToCartPage cartPage;
	SearchPage searchPage;
	SearchResultsPage resultsPage;
	ProductPage productPage;

	public AddToCartPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		searchPage = PageFactory.initElements(driver, SearchPage.class);// new SearchPage();
	}

	@Test(priority = 1)
	public void checkSize() throws InterruptedException {
		searchPage.setSearchBar("gulab jamun");
		resultsPage = searchPage.clickOnSearchButton();
		resultsPage.performFilter();
		if (resultsPage.checkResult()) {
			productPage = resultsPage.clickProduct();
			cartPage = productPage.clickAddToCart();
			System.out.println(cartPage.cartSize());
		} else {
			System.out.println("No results found");
		}
	}

	@AfterMethod
	public void screenShot(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
				Date date = new Date();
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("D:\\" + result.getName() + "dateFormat.format(date)" + ".png"));
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
	}

}
