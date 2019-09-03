package com.rd.epam.Flipkart.testCases;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rd.epam.Flipkart.DealsOfDay;
import com.rd.epam.Flipkart.pages.HomePage;
import com.rd.epam.Flipkart.pages.LoginPage;

public class DealsOfTheDayTest extends HomePageTest {
	
    WebDriver driver;

    
   
    @Test
    public void checkDeals() {
       
        
        DealsOfDay dealsOfTheDayPage = new DealsOfDay();
        dealsOfTheDayPage.goToBottom();
        List<WebElement> deals = dealsOfTheDayPage.trendingItemsList;
        List<String> titles=dealsOfTheDayPage.getTitles();
        for (int i = 0; i < titles.size(); i++) {
            System.out.println(titles.get(i));
        }
        System.out.println(titles.size());

 

    }

 

}


