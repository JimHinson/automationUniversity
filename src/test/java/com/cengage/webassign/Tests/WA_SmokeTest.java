/**
 * TestNG Method descriptions taken from https://www.tutorialspoint.com/testng/testng_basic_annotations.htm
 */
package com.cengage.webassign.Tests;

import com.cengage.webassign.BaseUtils.WebDriverFactory;
import org.testng.annotations.*;
import com.cengage.webassign.framework.core.BaseTest;

public class WA_SmokeTest extends BaseTest {

	@BeforeSuite
	//The annotated method will be run only once before all tests in this suite have run.\
	public void suiteSetup() throws Exception {}

	@BeforeTest //This will run before the tests to ensure test setup
	public void testSetup() throws Exception {
	}

	@BeforeClass
	//The annotated method will be run only once before the first test method in the current class is invoked.
	public void classSetup() {

	}

	@BeforeGroups
	//The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
	public void groupsSetup() {
	}

	@BeforeMethod // This will run before each test to remove dependency of any test from another
	public void methodSetup() {
	}

	@Test
	public void loadHomepage() throws Exception {
		this.driver = WebDriverFactory.composeWebDriver("chrome", "--disable-logging", 10000);
		driver.get("https://www.wa-staging.net/wa-auth/login");
		java.lang.Thread.sleep(2000);
	}

	@AfterGroups
	//The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
	public void groupsTeardown() {
	}

	@AfterClass
	//The annotated method will be run only once after all the test methods in the current class have run.
	public void classTeardown() {

	}


	@AfterTest //This will run after all the tests to close current browser instance
	//Note that the method may be named anything you'd like
	public void closeBrowser() {
		driver.close();
	}

	@AfterSuite
	//The annotated method will be run only once after all tests in this suite have run.
	public void cleanItAllUp() {
	}
}