package com.cengage.webassign.framework.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.util.List;
import com.cengage.webassign.BaseUtils.WebDriverFactory;

/**
 * BasePageFactory serves two purposes:
 * 1. Provide a common object interface to consumers (tests)
 * 2. Parent class to Page Objects which provides common functionality our pages need
 */

public class BasePageFactory {

    //These settings can be used to adjust the driver, making the
    //tests run faster, or slow them down if you get timeouts
    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;
    protected WebDriver driver = null;
    WebDriverWait wait;
    
    public BasePageFactory() {

    }
    
    public BasePageFactory(int implicitWait, String browser, String browserOptions) throws WebAssignException {
        this.driver = WebDriverFactory.composeWebDriver(browser, browserOptions, implicitWait);
    }

    public BasePageFactory(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }


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