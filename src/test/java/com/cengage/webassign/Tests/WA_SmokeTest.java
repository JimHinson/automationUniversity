package com.cengage.webassign.Tests;

import com.cengage.webassign.BaseUtils.WebDriverFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.cengage.webassign.framework.core.BaseTest;

public class WA_SmokeTest extends BaseTest {

	@BeforeTest //This will run before the tests to ensure test setup
	public void testSetup() throws Exception {

	}

	@BeforeMethod // This will run before each test to remove dependency of any test from another
	public void launchHomePage() {
	}

	@Test
	public void loadHomepage() throws Exception {
		this.driver = WebDriverFactory.composeWebDriver("chrome", "--disable-logging", 10000);
		driver.get("https://www.wa-staging.net/wa-auth/login");
		java.lang.Thread.sleep(2000);
	}

	@AfterTest //This will run after all the tests to close current browser instance
	public void closeBrowser() {
		driver.close();
	}
}