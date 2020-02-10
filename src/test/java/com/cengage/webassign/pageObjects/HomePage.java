package com.cengage.webassign.pageObjects;

import org.openqa.selenium.By;

import com.cengage.webassign.BaseUtils.TestSessionInitiator;

public class HomePage extends TestSessionInitiator {
	
	private By homePageNavBar = By.cssSelector("[aria-label='WebAssign']");
	private By homePage = By.cssSelector("main h1");
	private By assignmentHomePage = By.cssSelector("[data-test='My Assignments']>ul li a");
	private By myAssignMentPagelink = By.cssSelector("[aria-label='WebAssign'] [data-analytics='assignments-nav']");
	public static String homepageURL;
	
	public void getHomePageURL() {
		homepageURL = getCurrentPageUrl();
	}
	
	public boolean verifyHomePageNavBar() {
		return findElement(homePageNavBar).isDisplayed();
	}
	
	public String verifyHomePage() {
		return findElement(homePage).getText();
	}
	
	public void clickAssignmentLink() {
		findElement(assignmentHomePage).click();
	}
	
	public void clickMyAssignmentPageLink() {
		findElement(myAssignMentPagelink).click();
	}

}
