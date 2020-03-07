package com.cengage.webassign.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.cengage.webassign.BaseUtils.TestSessionInitiator;
import com.cengage.webassign.BaseUtils.WebDriverFactory;
import com.cengage.webassign.Utils.PropfileReader;
import com.cengage.webassign.framework.core.BasePageFactory;
import com.cengage.webassign.framework.core.BaseTest;
import com.cengage.webassign.framework.core.ChromeWebDriver;
import com.cengage.webassign.pageObjects.AssignmentPage;
import com.cengage.webassign.pageObjects.HomePage;
import com.cengage.webassign.pageObjects.LoginPage;
import com.cengage.webassign.pageObjects.MyAssignmentsPage;

public class WA_SmokeTest extends BaseTest {
	
	// LoginPage loginpage; // = new LoginPage();
	HomePage homePage; // = new HomePage();
	MyAssignmentsPage myAssignmentsPage; // = new MyAssignmentPage();
	AssignmentPage assignmentPage; // = new AssignmentPage();

	BasePageFactory basePage;
	/**
	 * TODO: move timeout to DefaultSettings.properties
	 * capture screenshot on failure
	 */
	
	@BeforeTest //This will run before all the tests to ensure test setup
	public void testSetup() throws Exception {
		String uid= (PropfileReader.getUserData("userId"));
		String pwd = (PropfileReader.getUserData("password"));
		String url = (PropfileReader.getUserData("url"));
		// driver = WebDriverFactory()
		//why is driver not initialized?
		String options = "--disable-logging";
		driver = new ChromeWebDriver().compose(options, 1000);

		LoginPage loginPage = new LoginPage(driver, url);
		loginPage.login(uid, pwd);
		Assert.assertEquals(true, loginPage.verifyLoginPageLogo());		
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.verifyHomePageNavBar(), true);
	}
	
	@BeforeMethod // This will run before each test to remove dependency of any test from another
	public void launchHomePage() {
		// launchUrl(testURL);
	}
	
	@Test
	public void UserAccessAssignmentHomePage() {
		Assert.assertEquals(homePage.verifyHomePageNavBar(), true);
		Assert.assertEquals(homePage.verifyHomePage(),"HOME");
		assignmentPage = homePage.clickAssignmentLink();
		// homePage.clickAssignmentLink();
		Assert.assertEquals(assignmentPage.verifyAssignmentTitleDisplayed(), true);
	}
	
	@Test
	public void UserAccessAssignmentMyAssignmentPage() {
		Assert.assertEquals(homePage.verifyHomePageNavBar(), true);
		myAssignmentsPage = homePage.clickMyAssignmentPageLink();
		Assert.assertEquals(myAssignmentsPage.verifyMyAssignmentPage(), "MY ASSIGNMENTS");
		assignmentPage = myAssignmentsPage.clickAssignmentLink(driver);
		// Assert.assertEquals(myassignmentpage.verifyAssignmentTitleDisplayed(), true);
	}
	
	@AfterTest //This will run after all the tests to close current browser instance
	public void closeBrowser() {
		driver.close();
	}
}