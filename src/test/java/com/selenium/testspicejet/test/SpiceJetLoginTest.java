package com.selenium.testspicejet.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.framework.MyDriver;
import com.selenium.test.pages.SpiceJetLoginPage;

public class SpiceJetLoginTest {

	private String webSite = "https://book.spicejet.com/";
	private String browser = "firefox";

	@Test
	public void test1() {

		final WebDriver driver = MyDriver.get(browser);
		driver.get(webSite);

		try {

			driver.manage().window().maximize();
			System.out.println(driver.getTitle());

			SpiceJetLoginPage spicejet = new SpiceJetLoginPage(driver);
			spicejet.selectTravelOptionsOneWay();
			spicejet.selectTravelOptionsRoundTrip();

			Thread.sleep(5000);

			spicejet.selectTravelOptionsOneWay();

			//spicejet.enterDepartureCity("MUM");
			WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_rbtnl_Trip_0")));
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isDisplayed();
			driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_ddl_originStation1_CTXT']")).isDisplayed();
			Thread.sleep(5000);

			//spicejet.enterArrivalCity("PAT");

			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
