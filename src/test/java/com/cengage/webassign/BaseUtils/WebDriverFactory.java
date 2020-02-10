package com.cengage.webassign.BaseUtils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverFactory {
	
	protected static WebDriver driver;
	WebDriverWait wait;
	
	public WebElement findElement(By WebElement) {
		return driver.findElement(WebElement);
	}
	
	public List<WebElement> findElements(By WebElement) {
		return driver.findElements(WebElement);
	}
	
	public WebElement waitForElementVisibility(By WebElement, long timeout) {
		wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(WebElement));	
	}
	
	public WebElement waitForElementEnable(By WebElement, long timeout) {
		wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(WebElement));	
	}
}
