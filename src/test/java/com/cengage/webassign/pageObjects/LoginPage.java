package com.cengage.webassign.pageObjects;

import org.openqa.selenium.By;

import com.cengage.webassign.BaseUtils.TestSessionInitiator;
import com.cengage.webassign.Utils.PropfileReader;

public class LoginPage extends TestSessionInitiator {
	
	private By loginPageLogo = By.cssSelector("[aria-label='Return to WebAssign']");
	private By emailInput = By.id("email");
	private By passwordInput = By.id("cengagePassword");
	private By signInButton = By.name("Login");
	
	public boolean verifyLoginPageLogo() {
		return findElement(loginPageLogo).isDisplayed();
	}
	
	public void sendUserNamePassword() {
		findElement(emailInput).sendKeys(PropfileReader.getUserData("userId"));
		System.out.println("sent uid: " + PropfileReader.getUserData("userId"));
		findElement(passwordInput).sendKeys(PropfileReader.getUserData("password"));
		System.out.println("sent password: " + PropfileReader.getUserData("password"));
	}
	
	public void clickSignIn() {
		findElement(signInButton).click();
	}

}
