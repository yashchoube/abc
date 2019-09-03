package com.rd.epam.Flipkart.pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

	WebDriver driver;
	List<String> titles;
	List<Integer> prices = new ArrayList<Integer>();
	int prev_value = 0;
	int next_value = 0;
	ListIterator<WebElement> elements;
	Actions action;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//div[@class='_1vC4OE _2rQ-NK']"),
			@FindBy(how = How.XPATH, using = "//div[@class='_1vC4OE']") })
	List<WebElement> productCosts;

	@FindBy(how = How.XPATH, using = "//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a")
	WebElement firstProduct;

	@FindBy(how = How.XPATH, using = "//a[@class='_3XS1AH _32ZSYo'][1]")
	WebElement filterCategory;

	@FindAll({ @FindBy(how = How.XPATH, using = "//div[@class='_3O0U0u']/div/div[not(.//div[@class='_3n6o0t'])])]") })
	List<WebElement> noFilterLabel;
//,
//	@FindBy(how = How.XPATH, using = "//div[@class='_3O0U0u']/div/div[not(.//div[@class='_3AqcXr'])]")
	@FindBys({ @FindBy(how = How.XPATH, using = "//div[@class='_3wU53n']") })
	List<WebElement> productNames;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Price -- Low to High')]")
	WebElement sortButton;

	@FindBys({ @FindBy(how = How.XPATH, using = "//div[@class=\"_3O0U0u\"]") })
	List<WebElement> resultList;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
	WebElement nextButton;

	@FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _2QL3XM _1eFTEo']")
	WebElement wrongMessage;

	@FindBy(how = How.XPATH, using = "//div[@class='bhgxx2 col-12-12'][1]/div/div[1]/div/a/div[2]/div[2]/div/div/div[@class='_1vC4OE _2rQ-NK']")
	WebElement product1Cost;

	@FindBy(how = How.XPATH, using = "//div[@class='bhgxx2 col-12-12'][2]/div/div[1]/div/a/div[2]/div[2]/div/div/div[@class='_1vC4OE _2rQ-NK']")
	WebElement product2Cost;

	@FindBy(how = How.XPATH, using = "//img[@class='_2rIV_l']")
	WebElement filterButton;

	@FindBys({ @FindBy(how = How.XPATH, using = "//span[@class='_2yAnYN']") })
	List<WebElement> resultChecker;

	public List<String> getTitles() {
		titles = new ArrayList<String>();
		for (int i = 0; i < productNames.size(); i++)
			titles.add(productNames.get(i).getText());
		return titles;
	}

	public List<Integer> getPrices() {
		prices.clear();
		for (int i = 0; i < productCosts.size(); i++) {
			String tempString = productCosts.get(i).getText().replaceAll(",", "");
			tempString = tempString.replaceAll("₹", "").trim();
			System.out.println(tempString);
			prices.add(Integer.valueOf(tempString));
		}
		return prices;
	}

	public ProductPage clickProduct() {
		firstProduct.click();
		return PageFactory.initElements(driver, ProductPage.class);
	}

	public int getPrice(WebElement element) {

		String tempString = element.getText().replaceAll(",", "");
		tempString = tempString.replaceAll("₹", "").trim();
		return Integer.valueOf(tempString);
	}

	public List<Integer> sortPrices() {

		Collections.sort(prices);
		return prices;
	}

	public boolean checkItems() {
		elements = (ListIterator<WebElement>) productCosts.listIterator();

		WebElement prev_element;// div[@class='_3LWrw9']
		WebElement next_element;
		while (elements.hasNext()) {
			if (elements.hasPrevious()) {
				prev_element = elements.previous();
				String tempString = prev_element.getText().replaceAll(",", "");
				tempString = tempString.replaceAll("₹", "").trim();
				prev_value = Integer.valueOf(tempString);
				elements.next();

			}
			next_element = (WebElement) elements.next();

			String tempString = next_element.getText().replaceAll(",", "");
			tempString = tempString.replaceAll("₹", "").trim();
			next_value = Integer.valueOf(tempString);

			if (prev_value > next_value) {
				action = new Actions(driver);
				action.moveToElement(next_element).perform();
				assertTrue(false);
			} else {
				System.out.println("Ok" + prev_value + next_value);
			}
		}
		if (nextButton.isEnabled()) {
			nextButton.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			checkItems();
		}
		return false;

	}

	public void checkFilterItem() {
		elements = (ListIterator<WebElement>) noFilterLabel.listIterator();
		while (elements.hasNext()) {
			WebElement element = elements.next();
			System.out.println(element.getText());
			action = new Actions(driver);
			action.moveToElement(element).perform();
			assertTrue(false);

		}

	}

	public int resultListSize() {
		return resultList.size();
	}

	public void performFilter() {
		try {
			filterCategory.click();
			Thread.sleep(1000);
			filterButton.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void performSort() {
		try {
			sortButton.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public boolean checkResult() {
		Boolean passFail = false;

		try {
			if (resultChecker.size() > 0)
				passFail = true;
		} catch (NullPointerException | NoSuchElementException e) {
			System.err.println("Unable to locate element '" + resultChecker + "'");
		}

		return passFail;

	}

}
