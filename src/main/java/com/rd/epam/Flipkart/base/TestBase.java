package com.rd.epam.Flipkart.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties properties;
	
	
	public TestBase(){
		try {
			properties = new Properties();
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Yash_Choube\\Desktop\\RD-Training\\Flipkart\\src\\main\\java\\com\\rd\\epam\\Flipkart\\config\\Configuration.properties");
			properties.load(fileInputStream);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		
		String browserName = properties.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
	
	
	}
	
	

	
}