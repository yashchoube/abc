package com.rd.epam.Flipkart.testCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.rd.epam.Flipkart.base.TestBase;
import com.rd.epam.Flipkart.pages.SearchPage;
import com.rd.epam.Flipkart.pages.SearchResultsPage;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class SortFilterTest extends TestBase {

	SearchResultsPage resultsPage;
	SearchPage searchPage;
	public SortFilterTest() {
		super();
	}
	@BeforeTest
	public void setUp(){
		initialization();
		searchPage = PageFactory.initElements(driver, SearchPage.class);
	}
	
	@Test
	public void checkItems() {
		searchPage.setSearchBar("mobiles");
		resultsPage = searchPage.clickOnSearchButton();
		resultsPage.performFilter();
		resultsPage.performSort();
		if (resultsPage.checkResult()) {
			resultsPage.checkItems();
		}
	}
	
	@AfterMethod
	 public void screenShot(ITestResult result){
	 if(ITestResult.FAILURE==result.getStatus()){
	 try{
		 TakesScreenshot screenshot=(TakesScreenshot)driver;
		 DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
	     Date date = new Date();
		 File src=screenshot.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("D:\\"+result.getName()+"dateFormat.format(date)"+".png"));
		 System.out.println("Successfully captured a screenshot");
		 }catch (Exception e){
		 System.out.println("Exception while taking screenshot "+e.getMessage());
	 } 
	 }
	 }
	
	
}
