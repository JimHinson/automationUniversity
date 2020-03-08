package com.cengage.webassign.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.cengage.webassign.Utils.PropfileReader;
import com.cengage.webassign.framework.core.BasePageFactory;
import com.cengage.webassign.framework.core.BaseTest;
import com.cengage.webassign.framework.core.ChromeWebDriver;
import com.cengage.webassign.pageObjects.AssignmentPage;
import com.cengage.webassign.pageObjects.HomePage;
import com.cengage.webassign.pageObjects.LoginPage;
import com.cengage.webassign.pageObjects.MyAssignmentsPage;

public class WA_SmokeTest extends BaseTest {
	
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AssignmentPage assignmentPage;
	BasePageFactory basePage;
	/**
	 * TODO: move timeout to DefaultSettings.properties
	 * capture screenshot on failure
	 */
	
	@BeforeTest //This will run before the tests to ensure test setup
	public void testSetup() throws Exception {
		String uid= (PropfileReader.getUserData("userId"));
		String pwd = (PropfileReader.getUserData("password"));
		String url = (PropfileReader.getUserData("url"));
		int implicitWait = new Integer(PropfileReader.getSetting("implicitTimeout")).intValue();
		String browser = (PropfileReader.getSetting("browser"));
		String browserOptions = (PropfileReader.getSetting("browserOptions"));
		// BasePageFactory page = new BasePageFactory(implicitWait, browser, browserOptions);
		LoginPage loginPage = new LoginPage(implicitWait, browser, browserOptions, url);
		
		homePage = loginPage.login(uid, pwd);
		Assert.assertEquals(true, loginPage.verifyLoginPageLogo());		
		// homePage = new HomePage(driver);
		Assert.assertEquals(homePage.verifyHomePageNavBar(), true);
	}
	
	@BeforeMethod // This will run before each test to remove dependency of any test from another
	public void launchHomePage() {
	}
	
	@Test
	public void UserAccessAssignmentHomePage() {
		Assert.assertTrue(homePage.verifyHomePageNavBar());
		Assert.assertEquals(homePage.verifyHomePage(),"HOME");
		assignmentPage = homePage.clickAssignmentLink();
		Assert.assertTrue(assignmentPage.verifyAssignmentTitleDisplayed());
	}
	
	@Test
	public void UserAccessAssignmentMyAssignmentPage() {
		Assert.assertTrue(homePage.verifyHomePageNavBar());
		myAssignmentsPage = homePage.clickMyAssignmentPageLink();
		Assert.assertEquals(myAssignmentsPage.verifyMyAssignmentPage(), "MY ASSIGNMENTS");
		assignmentPage = myAssignmentsPage.clickAssignmentLink();
		Assert.assertTrue(assignmentPage.verifyAssignmentTitleDisplayed());
	}
	
	@AfterTest //This will run after all the tests to close current browser instance
	public void closeBrowser() {
		homePage.close();
	}
}