package com.rd.epam.Flipkart.testCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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
import com.rd.epam.Flipkart.pages.SearchPage;
import com.rd.epam.Flipkart.pages.SearchResultsPage;

public class SearchTest extends TestBase {
	SearchPage searchPage;
	SearchResultsPage resultsPage;

	public SearchTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		searchPage = PageFactory.initElements(driver, SearchPage.class);// new SearchPage();
	}

	@Test
	public void checkResultTrue() {
		searchPage.setSearchBar("mobile");
		resultsPage = searchPage.clickOnSearchButton();
		PageFactory.initElements(driver, SearchResultsPage.class);
		assertTrue(resultsPage.checkResult());
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
