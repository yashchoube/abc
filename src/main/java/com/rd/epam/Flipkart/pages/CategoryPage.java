package com.rd.epam.Flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rd.epam.Flipkart.base.TestBase;

public class CategoryPage extends TestBase {

	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div/div[@class='zi6sUf']/div[@class='_3zdbog _3Ed3Ub']/ul[@class='_114Zhd']/li[1]")
	WebElement category;
	
	public CategoryPage(WebDriver driver){
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }


public void pointToElement() {
	
	PageFactory.initElements(driver, this);
	Actions action = new Actions(driver);
	action.moveToElement(category).perform();
	
}



}