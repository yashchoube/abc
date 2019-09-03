package com.rd.epam.Flipkart.testCases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rd.epam.Flipkart.base.TestBase;
import com.rd.epam.Flipkart.pages.CategoryPage;
import com.rd.epam.Flipkart.pages.HomePage;
import com.rd.epam.Flipkart.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest(){
	
		
		super();
	
	}
	
	
	@BeforeTest
	public void setUp(){
		
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		//initialization();
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
	}
	
	@Test(priority=2)
	public void validateLogin() {
		
		homePage = loginPage.loginFunction(properties.getProperty("username"), properties.getProperty("password"));
		System.out.println(homePage);
		
		String actualTitle = homePage.getHomeUserLabelText();
		Assert.assertEquals(actualTitle,"Jaideep");
	   
	}
	@AfterMethod
	 public void screenShot(ITestResult result){
	 if(ITestResult.FAILURE==result.getStatus()){
	 try{
	 TakesScreenshot screenshot=(TakesScreenshot)driver;
	 File src=screenshot.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(src, new File("D:\\"+result.getName()+".png"));
	 System.out.println("Successfully captured a screenshot");
	 }catch (Exception e){
	 System.out.println("Exception while taking screenshot "+e.getMessage());
	 } 
	 }
	 }
	                                   
	
	
}
