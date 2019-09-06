package com.selenium.testSpiceJet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import static junit.framework.Assert.assertTrue;

public class SpiceJetLoginPage extends LoadableComponent<SpiceJetLoginPage> {

	private final WebDriver driver;

	@FindBy(css = "input[value='OneWay']")
	WebElement rdbOneWay;

	@FindBy(css = "input[value='RoundTrip']")
	WebElement roundTrip;
	
	@FindBy(id = "ctl00_mainContent_ddl_originStation1_CTXT")
	WebElement departureCity;

	@FindBy(id = "ctl00_mainContent_ddl_destinationStation1_CTXT")
	WebElement arrivalCity;
	
	private boolean isPageLoaded;

	public SpiceJetLoginPage(WebDriver driver) {
		this.driver = driver;

		// This call sets the WebElement fields.
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
	}

	@Override
	protected void isLoaded() throws Error {
		String url = driver.getCurrentUrl();
		assertTrue("Not on the issue entry page: " + url, url.endsWith("spicejet.com"));
	}

	public void selectTravelOptionsOneWay() {
		rdbOneWay.click();
	}
	
	public void selectTravelOptionsRoundTrip() {
		roundTrip.click();
	}
	
	public void enterDepartureCity(String depCity) {
		departureCity.click();
		System.out.println("Entering depCity");
		departureCity.sendKeys(depCity);
		System.out.println("Entered depCity");
	}

	public void enterArrivalCity(String arrCity) {
		arrivalCity.click();
		System.out.println("Entering arrCity");
		arrivalCity.sendKeys(arrCity);
		System.out.println("Entered arrCity");
	}
}
