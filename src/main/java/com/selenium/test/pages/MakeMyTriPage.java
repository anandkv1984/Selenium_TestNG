package com.selenium.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import static junit.framework.Assert.assertTrue;

public class MakeMyTriPage extends LoadableComponent<MakeMyTriPage> {

	private final WebDriver driver;

	@FindBy(css = "input[value='OneWay']")
	WebElement rdbOneWay;

	@FindBy(css = "input[value='RoundTrip']")
	WebElement roundTrip;
	
	@FindBy(id = "fromCity")
	WebElement fromCity;
	
	@FindBy(css = ".fsw_inputBox.searchCity.inactiveWidget")
	WebElement fromSection;
	
	@FindBy(css = "input.react-autosuggest__input.react-autosuggest__input--open")
	WebElement txbFrom;
	
	@FindBy(css = "div.fsw_inputBox.searchToCity.inactiveWidget.activeWidget input.react-autosuggest__input.react-autosuggest__input--open")
	WebElement txbToCity;
	

	@FindBy(id = "ctl00_mainContent_ddl_destinationStation1_CTXT")
	WebElement arrivalCity;
	
	private boolean isPageLoaded;

	public MakeMyTriPage(WebDriver driver) {
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
		assertTrue("Not on the issue entry page: " + url, url.endsWith("makemytrip.com"));
	}

	public void selectTravelOptionsOneWay() {
		rdbOneWay.click();
	}
	
	public void selectTravelOptionsRoundTrip() {
		roundTrip.click();
	}
	
	public void clickfromSection() {
		fromSection.click();
	}
	public void enterDepartureCity(String depCity) {
		System.out.println("Entering depCity");
		txbFrom.sendKeys(depCity);
		System.out.println("Entered depCity");
	}

	public void enterArrivalCity(String arrCity) {
		txbToCity.click();
		System.out.println("Entering arrCity");
		txbToCity.sendKeys(arrCity);
		System.out.println("Entered arrCity");
	}
	
	public void selectFromCity() {
		
	}
}
