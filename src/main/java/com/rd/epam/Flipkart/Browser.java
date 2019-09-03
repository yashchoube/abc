package com.rd.epam.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	private static Browser browser = null;
	private WebDriver webDriver=null;

	private Browser() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		webDriver = new ChromeDriver();
	}

	public static Browser getBrowser() {
		if (browser == null) {
			browser = new Browser();
		}
		return browser;
	}

	public WebDriver getDriver() {
		return webDriver;
	}
}
