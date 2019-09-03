package com.rd.epam.Flipkart;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.rd.epam.Flipkart.base.TestBase;

public class DealsOfDay extends TestBase{
	static WebDriver driver;

	 

    public DealsOfDay() {
    	PageFactory.initElements(driver, this);
       
    }

 
    

    @FindBys({ @FindBy(how = How.XPATH, using = "//div[@class=\"MDGhAp\"]") })
	public
    List<WebElement> trendingItemsList;

 

    @FindBy(how = How.XPATH, using = "//span[@class='_2tFDQF']")
    WebElement footer;
    
    @FindBys({ @FindBy(how = How.XPATH, using = "//div[@class='iUmrbN']") })
    List<WebElement> trendingItemsTitles;

 

    public List<String> getTitles() {
        List<String> dealsTitles = new ArrayList<String>();
        for (int i = 0; i < trendingItemsTitles.size(); i++)
            dealsTitles.add(trendingItemsTitles.get(i).getText());

 

        return dealsTitles;
    }

 

    public void goToBottom() {
        
        for (int second = 0;; second++) {
            if (second==15) {
                break;
            }
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        }
    }

}
