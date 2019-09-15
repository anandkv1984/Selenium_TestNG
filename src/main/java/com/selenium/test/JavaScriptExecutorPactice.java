package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.framework.WaitUtils;

public class JavaScriptExecutorPactice {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "D:\\automation_practice\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void enterTextWithJavaScript() throws InterruptedException {

		try {
			driver.get("https://nightly-realize.realizedev.com/community/");
			driver.manage().window().maximize();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("document.getElementById('username').value='new value1';");
			Thread.sleep(5000);
			executor.executeScript("document.getElementById(\"username\").value='new value2';");
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	@Test
	public void enterTextWithJavaScript2() throws InterruptedException {

		try {
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("document.getElementsByName('q')[0].value='new value1';");
			Thread.sleep(5000);
			executor.executeScript("document.getElementsByName(\"q\")[0].value='new value2';");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	@Test
	public void enterTextWithJavaScript3() throws InterruptedException {

		try {
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("document.getElementsByName('search_query')[0].value='new value1';");
			Thread.sleep(5000);
			executor.executeScript("document.getElementsByName(\"search_query\")[0].value='new value2';");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	@Test
	public void scrollonPage() {
		
		// Creating the JavascriptExecutor interface object by Type casting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Launching the Site.
		driver.get("https://nightly-realize.realizedev.com/community/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("anand172");
		
		WebElement password = driver.findElement(By.id("password"));
		password.click();
		
		WebElement submit = driver.findElement(By.xpath("//*[@class='btn-submit']"));
		submit.click();
		
		WebElement classesTab = driver.findElement(By.id("classes"));
		//(new WebDriverWait(driver, 10)).pollingEvery(500, TimeUnit.MILLISECONDS).withMessage("Classes tab not visible").until(ExpectedConditions.visibilityOf(classesTab));
		
		WaitUtils.waitForElement(driver, classesTab);
		
		classesTab.click();
		
		(new WebDriverWait(driver, 10)).pollingEvery(500, TimeUnit.MILLISECONDS).withMessage("Classes tab not visible").until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Select a Class')]"))));
		
		
		//Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");
        
        js.executeScript("window.scrollBy(0,0)");
        
        	//driver.switchTo().window(arg0)

	}
	
	@Test
	public void scrollIntoViewJS() throws InterruptedException {
		driver.get("https://nightly-realize.realizedev.com/community/");
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		try {
			executor.executeScript("document.getElementById('username').value='anand172';");
			Thread.sleep(5000);
			executor.executeScript("document.getElementById(\"password\").value='testing123$';");
			Thread.sleep(5000);

			WebElement submitButton = driver.findElement(By.xpath("//*[@class='btn-submit']"));

			executor.executeScript("arguments[0].click();", submitButton);

			WebElement manyPrograms = driver.findElement(By.xpath("//li[@ng-switch-when='MANY_PROGRAMS']"));

			(new WebDriverWait(driver, 10)).pollingEvery(500, TimeUnit.MILLISECONDS).withMessage("not found")
					.until(ExpectedConditions.visibilityOf(manyPrograms));

			System.out.println(manyPrograms.isDisplayed());
			
			WebElement classesTab = driver.findElement(By.id("classes"));
			classesTab.click();
			
			WebElement selectclasslabel = driver.findElement(By.xpath("//h1[contains(text(),'Select a Class')]"));
			
			WaitUtils.waitForElement(driver, selectclasslabel);
			//(new WebDriverWait(driver, 10)).pollingEvery(500, TimeUnit.MILLISECONDS).withMessage("Classes tab not visible").until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Select a Class')]"))));
			
			WebElement element = driver.findElement(By.xpath("//a[contains(text(),'889_NativeAssessment')]"));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	@Test
	public void clickWithJavaScript() {

		try {
			driver.get("https://nightly-realize.realizedev.com/community/");
			driver.manage().window().maximize();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("document.getElementById('username').value='anand172';");
			Thread.sleep(5000);
			executor.executeScript("document.getElementById(\"password\").value='testing123$';");
			Thread.sleep(5000);

			WebElement submitButton = driver.findElement(By.xpath("//*[@class='btn-submit']"));

			executor.executeScript("arguments[0].click();", submitButton);

			WebElement manyPrograms = driver.findElement(By.xpath("//li[@ng-switch-when='MANY_PROGRAMS']"));

			(new WebDriverWait(driver, 10)).pollingEvery(500, TimeUnit.MILLISECONDS).withMessage("not found")
					.until(ExpectedConditions.visibilityOf(manyPrograms));

			System.out.println(manyPrograms.isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

	@Test
	public void navigatetopagewithJS() {
		try {
			// Creating the JavascriptExecutor interface object by Type casting
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// Launching the Site.
			driver.get("http://demo.guru99.com/V4/");
			
			// Fetching the Domain Name of the site. Tostring() change object to name.
			String DomainName = js.executeScript("return document.domain;").toString();
			System.out.println("Domain name of the site = " + DomainName);
			
			// Fetching the URL of the site. Tostring() change object to name
			String url = js.executeScript("return document.URL;").toString();
			System.out.println("URL of the site = " + url);
			
			// Method document.title fetch the Title name of the site. Tostring() change
			// object to name
			String TitleName = js.executeScript("return document.title;").toString();
			System.out.println("Title of the page = " + TitleName);
			
			// Navigate to new Page i.e to generate access page. (launch new url)
			js.executeScript("window.location = 'http://demo.guru99.com/'");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			driver.quit();
		}
	}

}
