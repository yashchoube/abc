package com.rd.epam.Flipkart.pages;

import java.util.List;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.rd.epam.Flipkart.base.TestBase;

public class HomePage extends TestBase {

	 

    WebDriver driver;

 

    public HomePage() {
    	
    	PageFactory.initElements(driver, this);
    }
    
//    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Deals of the Day')]")
//    WebElement dealsOfDayTitle;
//    
//    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Deals of the Day')]/parent::div/div[@class='_2Umlwf']/a")
//    WebElement dealsOfDayLink;
//    
//    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Trending Offers')]")
//    WebElement trendingItemsTitle;
//    
//    @FindBys({ @FindBy(how = How.XPATH, using = "//div[@data-tracking-id='Trending Offers']/div/div/div/div[@class='_2kSfQ4']") })
//    List<WebElement> trendingItems;
//    
    
    @FindBy(xpath="//*[text()='Jaideep']")
    WebElement homeUserName;
    
//    public String checkTOTitle() {
//    	return driver.getTitle();    }
//    
//    public boolean checkTOSize() {
//        int size=trendingItems.size();
//        return size>0;
//    }
//    
//    public void bottom() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//    }
    
    
    
    public String getHomeUserLabelText()
    {
    	
    
    	return homeUserName.getText(); 
    }
    
    
    
   

 

}