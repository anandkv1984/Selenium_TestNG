package com.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {

	public static WebDriver get(String browser) {
		WebDriver driver = null;

		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\java_practice\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\java_practice\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("***** Invalid browser ******");
			break;
		}

		return driver;
	}

}
