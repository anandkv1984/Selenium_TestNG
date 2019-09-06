package com.selenium.testspicejet.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.framework.MyDriver;
import com.selenium.testSpiceJet.pages.MakeMyTrip;
import com.selenium.testSpiceJet.pages.SpiceJetLoginPage;

public class MakeMyTripTest {

	private String webSite = "https://www.makemytrip.com";
	private String browser = "firefox";

	@Test
	public void test1() {

		final WebDriver driver = MyDriver.get(browser);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(webSite);

		try {

			driver.manage().window().maximize();
			System.out.println(driver.getTitle());

			MakeMyTrip mmt = new MakeMyTrip(driver);

			//spicejet.enterDepartureCity("MUM");
			WebDriverWait wait = new WebDriverWait(driver, 10);// 1 minute 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
			driver.findElement(By.id("fromCity")).isDisplayed();
			driver.findElement(By.xpath("//input[@id = 'fromCity']")).click();

			mmt.enterDepartureCity("Mumbai");
			
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Mumbai, India']")));
			driver.findElement(By.xpath("//*[@class='react-autosuggest__suggestions-list'] //p[contains(text(),'Mumbai')]")).click();
			
			mmt.enterArrivalCity("Bangalore");
			
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Mumbai, India']")));
			driver.findElement(By.xpath("//*[@class='react-autosuggest__suggestions-list'] //p[contains(text(),'Bangalore')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@aria-label='Wed Sep 11 2019']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
