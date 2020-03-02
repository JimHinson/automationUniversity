package com.cengage.webassign.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.cengage.webassign.BaseUtils.TestSessionInitiator;
import com.cengage.webassign.Utils.PropfileReader;
import com.cengage.webassign.pageObjects.AssignmentPage;
import com.cengage.webassign.pageObjects.HomePage;
import com.cengage.webassign.pageObjects.LoginPage;
import com.cengage.webassign.pageObjects.MyAssignmentPage;

public class WA_SmokeTest extends TestSessionInitiator{
	
	LoginPage loginpage = new LoginPage();
	HomePage homePage = new HomePage();
	MyAssignmentPage myassignmentpage = new MyAssignmentPage();
	AssignmentPage assignmentPage = new AssignmentPage();
	private String testURL = PropfileReader.getUserData("url");

	/**
	 * TODO: move timeout to DefaultSettings.properties
	 * capture screenshot on failure
	 */
	
	@BeforeTest //This will run before all the tests to ensure test setup
	public void testSetup() {
		launchBrowser();
		launchUrl(testURL);
		Assert.assertEquals(true, loginpage.verifyLoginPageLogo());
		loginpage.sendUserNamePassword();
		try {
			driver.wait(100);
		} catch (Exception e) {
			System.out.println("testSetup() exception: " + e.getMessage());		
		}
		loginpage.clickSignIn();
		
		Assert.assertEquals(homePage.verifyHomePageNavBar(), true);
		homePage.getHomePageURL();
	}
	
	@BeforeMethod // This will run before each test to remove dependency of any test from another
	public void launchHomePage() {
		launchUrl(HomePage.homepageURL);
	}
	
	@Test
	public void UserAccessAssignmentHomePage() {
		Assert.assertEquals(homePage.verifyHomePageNavBar(), true);
		Assert.assertEquals(homePage.verifyHomePage(),"HOME");
		homePage.clickAssignmentLink();
		Assert.assertEquals(assignmentPage.verifyAssignmentTitleDisplayed(), true);
	}
	
	@Test
	public void UserAccessAssignmentMyAssignmentPage() {
		Assert.assertEquals(homePage.verifyHomePageNavBar(), true);
		homePage.clickMyAssignmentPageLink();
		Assert.assertEquals(myassignmentpage.verifyMyAssignmentPage(), "MY ASSIGNMENTS");
		myassignmentpage.clickAssignmentLink();
		Assert.assertEquals(assignmentPage.verifyAssignmentTitleDisplayed(), true);
	}
	
	@AfterTest //This will run after all the tests to close current browser instance
	public void closeBrowser() {
		closeCurrentBrowser();
	}
}