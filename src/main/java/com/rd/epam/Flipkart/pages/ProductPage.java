package com.rd.epam.Flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	WebDriver driver;
	WebDriverWait wait;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[@class=\"_35KyD6\"]")
	WebElement productName;

	@FindBy(how = How.XPATH, using = "//div[@class=\"_1vC4OE _3qQ9m1\"]")
	WebElement productPrice;

	@FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement addCartButton;

	@FindBy(how = How.XPATH, using = "//button[@class=\"_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c\"]")
	WebElement buyNowButton;

	public AddToCartPage clickAddToCart() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		Thread.sleep(4000);
		for (String childTab : driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}

		Actions actions = new Actions(driver);

		wait = new WebDriverWait(driver, 2);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")));
		actions.moveToElement(addCartButton).click().build().perform();
		return new PageFactory().initElements(driver, AddToCartPage.class);
	}

}
