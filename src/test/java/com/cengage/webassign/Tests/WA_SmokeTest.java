package com.cengage.webassign.Tests;

import com.cengage.webassign.BaseUtils.WebDriverFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.cengage.webassign.Utils.PropfileReader;
import com.cengage.webassign.framework.core.BaseTest;
import com.cengage.webassign.pageObjects.HomePage;
import com.cengage.webassign.pageObjects.LoginPage;

public class WA_SmokeTest extends BaseTest {
	
//	HomePage homePage;
	/**
	 * TODO: move timeout to DefaultSettings.properties
	 * capture screenshot on failure
	 */
	
	@BeforeTest //This will run before the tests to ensure test setup
	public void testSetup() throws Exception {

	}

	@Test
	public void loadHomepage() throws Exception {
		this.driver = WebDriverFactory.composeWebDriver("chrome", "--disable-logging", 10000);
	}
	
	@BeforeMethod // This will run before each test to remove dependency of any test from another
	public void launchHomePage() {
	}
	

	
	@AfterTest //This will run after all the tests to close current browser instance
	public void closeBrowser() {
		driver.close();
//		homePage.close();
	}
}