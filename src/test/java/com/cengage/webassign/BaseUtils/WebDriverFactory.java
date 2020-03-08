package com.cengage.webassign.BaseUtils;
import com.cengage.webassign.framework.core.WebAssignException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cengage.webassign.framework.core.ChromeWebDriver;


public class WebDriverFactory  {
	// protected 
	// protected abstract WebDriverFactory init();

	// public abstract WebDriver compose(String options, int implicitWait) throws WebAssignException;
	protected WebDriverFactory(){

	}

	public static WebDriver composeWebDriver(String browser, String properties, int implicitWait) throws WebAssignException {
		WebDriver webDriver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeWebDriver chromeWebDriver = new ChromeWebDriver();
			webDriver = chromeWebDriver.compose(properties, implicitWait);
			// return (new ChromeWebDriver()).compose(properties, implicitWait);
		}
		return webDriver;
	}


}
