package com.cengage.webassign.pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.*;

import com.cengage.webassign.BaseUtils.WebDriverFactory;
// import com.cengage.webassign.Utils.PropfileReader;
import com.cengage.webassign.framework.core.BasePageFactory;
import com.cengage.webassign.framework.core.ChromeWebDriver;
import com.cengage.webassign.framework.core.WebAssignException;

public class LoginPage extends BasePageFactory {
	
	private By loginPageLogo = By.cssSelector("[aria-label='Return to WebAssign']");
	private By emailInput = By.id("email");
	private By passwordInput = By.id("cengagePassword");
	private By signInButton = By.name("Login");

	// public LoginPage(WebDriver driver) {
	// 	super(driver);
	// 	// driver.get()
	// }

	public LoginPage(WebDriver driver, String testURL) {
		super(driver);
		driver.get(testURL);
	}

	protected LoginPage() {
		// return LoginPage(100, "chrome", "");
	}

	public LoginPage(int implicitWait, String browser, String browserOptions, String url) throws WebAssignException {
		this.driver = WebDriverFactory.composeWebDriver(browser, browserOptions, implicitWait);
		driver.get(url);
		return;
	}
	
	public boolean verifyLoginPageLogo() {
		return findElement(loginPageLogo).isDisplayed();
	}
	
	public HomePage login(String uid, String pwd) {
		findElement(emailInput).sendKeys(uid);
		System.out.println("sent uid: " + uid);
		findElement(passwordInput).sendKeys(pwd);
		System.out.println("sent password: " + pwd);
		clickSignIn();
		return new HomePage(driver);
	}
	
	protected void clickSignIn() {
		findElement(signInButton).click();
	}

}
