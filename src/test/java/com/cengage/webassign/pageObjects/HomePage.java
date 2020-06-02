package com.cengage.webassign.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cengage.webassign.framework.core.BasePageFactory;

public class HomePage extends BasePageFactory {
	private By homePageNavBar = By.cssSelector("[aria-label='WebAssign']");
	private By homePage = By.cssSelector("main h1");
	private By assignmentHomePage = By.cssSelector("[data-test='My Assignments']>ul li a");
	public static String homepageURL;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyHomePageNavBar() {
		return findElement(homePageNavBar).isDisplayed();
	}
	
	public String verifyHomePage() {
		return findElement(homePage).getText();
	}
	
	public void close() {
		this.driver.close();
	}
}