package com.selenium.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	public static boolean waitForElement(WebDriver driver, WebElement e) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			wait.pollingEvery(500, TimeUnit.MILLISECONDS).until(ExpectedConditions.visibilityOf(e));
			
			return true;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
	}
	
public static boolean waitForElement(WebDriver driver, WebElement e, int WaitTime) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, WaitTime);
			
			wait.pollingEvery(500, TimeUnit.MILLISECONDS).until(ExpectedConditions.visibilityOf(e));
			
			return true;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
	}

public static boolean waitForElement(WebDriver driver, WebElement e, int WaitTime, int waitPoolingTime) {
	
	try {
		WebDriverWait wait = new WebDriverWait(driver, WaitTime);
		
		wait.pollingEvery(waitPoolingTime, TimeUnit.MILLISECONDS).until(ExpectedConditions.visibilityOf(e));
		
		return true;
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		return false;
	}
}
	
}
