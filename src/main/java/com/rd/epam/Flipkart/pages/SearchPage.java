package com.rd.epam.Flipkart.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.rd.epam.Flipkart.base.TestBase;

public class SearchPage extends TestBase {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='Y5-ZPI']/form//button[@class='vh79eN']")
	WebElement searchButton;

	

	@FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _29YdH8']")
	WebElement popupHandler;

	@FindBy(how = How.XPATH, using = "//input[@class=\"LM6RPg\"]")
	WebElement searchBar;

	public void setSearchBar(String productName) {
		popupHandler.click();
		searchBar.sendKeys(productName);
	}

	public SearchResultsPage clickOnSearchButton() {

		Actions actions = new Actions(driver);
		actions.moveToElement(searchButton).click().build().perform();
		return PageFactory.initElements(driver, SearchResultsPage.class);

	}

	

}
