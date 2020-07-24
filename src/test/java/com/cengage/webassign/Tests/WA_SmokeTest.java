package com.cengage.webassign.Tests;

import com.cengage.webassign.BaseUtils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	String uid = "";
	String pwd = "";
	String url = "";
	int implicitWait = 0;
	String browser = "";
	HomePage hp = null;
	LoginPage lp;
	WebDriver driver;
	
	@BeforeTest //This will run before the tests to ensure test setup
	public void testSetup() throws Exception {
		uid= (PropfileReader.getUserData("userId"));
		pwd = (PropfileReader.getUserData("password"));
		url = (PropfileReader.getUserData("url"));
		implicitWait = new Integer(PropfileReader.getSetting("implicitTimeout")).intValue();
		browser = (PropfileReader.getSetting("browser"));
		driver = WebDriverFactory.composeWebDriver(browser, "--disable-logging", implicitWait);
	}

	@Test(priority = 1)
	public void login() throws Exception {
		lp = new LoginPage(driver, url);
		Assert.assertTrue(lp.verifyLoginPageLogo());
		hp = lp.login(driver, uid, pwd);
	}

	@Test(priority = 2)
	public void loadHomePage() throws Exception {
		hp.verifyHomePage();
		Assert.assertTrue(hp.verifyHomePage());
		java.lang.Thread.sleep(2000);
		hp.verifyHomePage();
	}
	
	@BeforeMethod // This will run before each test to remove dependency of any test from another
	public void launchHomePage() {
	}
	

	
	@AfterTest //This will run after all the tests to close current browser instance
	public void closeBrowser() {
		driver.close();
	}
}